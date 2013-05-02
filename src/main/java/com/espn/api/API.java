package com.espn.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.zip.GZIPInputStream;

public abstract class API<T> {
   
   private static Properties props = null;
   private static String apiKey = null;
   private static String apiBaseUrl = null;
   private String apiUrl = null;
   
   public API() {
      super();
      
      if (props == null) {
			init();
      }
   }
   
   private static void init() {
      try {
         props = new Properties();
         File jarFile = new File(API.class.getProtectionDomain().getCodeSource().getLocation().getPath());
         String propFilePath = jarFile.getParent();
         FileInputStream fis = new FileInputStream(propFilePath.concat("\\com.espn.api.properties"));
         // fis = new FileInputStream(propFilePath.concat("\\src\\main\\resources\\com.espn.api.properties"));
         props.load(fis);
         
         apiKey = props.getProperty("api.key");
         apiBaseUrl = props.getProperty("api.base.url");
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      } 
      catch (InvalidPropertiesFormatException e) {
         e.printStackTrace();
      } 
      catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   private void buildUrl() {
      this.apiUrl = apiBaseUrl.concat("?apikey=").concat(apiKey);
   }
   
   protected String getJsonResponse() {
      if (this.apiUrl == null) {
         this.buildUrl();
      }
      
      StringBuilder response = new StringBuilder();
      
      try {
         final URL url = new URL(this.apiUrl);
         final URLConnection connection = url.openConnection();

         connection.setDoOutput(true);
         connection.setRequestProperty("Accept-Encoding", "gzip");

         final OutputStream outputStream = connection.getOutputStream();
         final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
         
         String data = "";
         outputStreamWriter.write(data);
         outputStreamWriter.flush();

         final InputStream replyStream = connection.getInputStream();
         final InputStreamReader inputStreamReader;

         // The following is to check if the server sending the response supports
         // Gzip
         final String contentEncodingField = connection.getHeaderField("Content-Encoding");
         if (contentEncodingField != null && contentEncodingField.equalsIgnoreCase("gzip")) {
            // read the gzipped format
            final GZIPInputStream gzipInputStream = new GZIPInputStream(replyStream);
            inputStreamReader = new InputStreamReader(gzipInputStream);
         } else {
            inputStreamReader = new InputStreamReader(replyStream);
         }

         
         final BufferedReader reader = new BufferedReader(inputStreamReader);
         String line = null;
         while ((line = reader.readLine()) != null) {
            response.append(line);
         }
         outputStreamWriter.close();
         reader.close();
      }
      catch (IOException e) {
         e.printStackTrace();
      }

      return response.toString();
   }
   
   public abstract T getAPIData();
}
