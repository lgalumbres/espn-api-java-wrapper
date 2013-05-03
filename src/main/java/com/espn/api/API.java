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
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.zip.GZIPInputStream;

public abstract class API<T> {
   
   // Common API resources
   public static final String RESOURCE_SPORTS = "/sports";
   public static final String RESOURCE_BASEBALL = "/sports/baseball";
   public static final String RESOURCE_BASEBALL_MLB = "/sports/baseball/mlb";
   public static final String RESOURCE_BASKETBALL = "/sports/basketball";
   public static final String RESOURCE_BASKETBALL_NBA = "/sports/basketball/nba";
   public static final String RESOURCE_BASKETBALL_WNBA = "/sports/basketball/wnba";
   public static final String RESOURCE_BASKETBALL_NCAAB = "/sports/basketball/mens-college-basketball";
   public static final String RESOURCE_BASKETBALL_NCAAW = "/sports/basketball/womens-college-basketball";
   public static final String RESOURCE_FOOTBALL = "/sports/football";
   public static final String RESOURCE_FOOTBALL_NFL = "/sports/football/nfl";
   public static final String RESOURCE_HOCKEY = "/sports/hockey";
   public static final String RESOURCE_HOCKEY_NHL = "/sports/hockey/nhl";
   public static final String RESOURCE_SOCCER = "/sports/soccer";
   public static final String RESOURCE_GOLF = "/sports/golf";
   public static final String RESOURCE_TENNIS = "/sports/tennis";
   public static final String RESOURCE_MMA = "/sports/mma";
   public static final String RESOURCE_BOXING = "/sports/boxing";
   public static final String RESOURCE_XGAMES = "/sports/action-sports";
   public static final String RESOURCE_XGAMES_BMX = "/sports/action-sports/bmx";
   public static final String RESOURCE_XGAMES_MOTOX = "/sports/action-sports/motox";
   public static final String RESOURCE_XGAMES_SKATEBOARDING = "/sports/action-sports/skateboarding";
   public static final String RESOURCE_XGAMES_SKIING = "/sports/action-sports/skiing";
   public static final String RESOURCE_XGAMES_SNOWBOARDING = "/sports/action-sports/snowboarding";
   public static final String RESOURCE_XGAMES_SNOWMOBILING = "/sports/action-sports/snowmobiling";
   public static final String RESOURCE_XGAMES_SURFING = "/sports/action-sports/surfing";
   public static final String RESOURCE_XGAMES_RALLY = "/sports/action-sports/rally";
   
   private static Properties props = null;
   private static String apiKey = null;
   private static String apiBaseUrl = null;
   private String apiResource = null;
   private String apiMethod = null;
   private String apiUrl = null;
   
   public API() {
      super();
   }
   
   public API(String resource) {
      super();
      this.apiResource = resource;
   }
   
   public API(String resource, String method) {
      super();
      this.apiResource = resource;
      this.apiMethod = method;
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
      if (props == null) {
         init();
      }
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
   
   public boolean isSupportedResource(String resource) {
      boolean isSupported = false;
      Field[] fields = API.class.getDeclaredFields();
      for (Field field : fields) {
         try {
            if (field.getName().startsWith("RESOURCE")) {
               String value = (String)field.get(null);
               isSupported = value.equalsIgnoreCase(resource);
            }
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      }
      return isSupported;
   }
}
