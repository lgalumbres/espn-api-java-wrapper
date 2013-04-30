package com.espn.api.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.zip.GZIPInputStream;

import com.espn.api.sports.Sport;
import com.espn.api.sports.Sports;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class SportsTest {
   
   private static String requestUrl = "http://api.espn.com/v1/sports?apikey=_____";
   
   public static void main(String[] args) throws JsonSyntaxException, IOException {
      GsonBuilder builder = new GsonBuilder();
      Gson gson = builder.create();
      Sports root = gson.fromJson(makeRequest(), Sports.class);
      System.out.println("links.api.news=" + root.getLinks().getApi().getNews().getHref());
      System.out.println("links.api.headlines=" + root.getLinks().getApi().getHeadlines().getHref());
      System.out.println("links.api.notes=" + root.getLinks().getApi().getNotes().getHref());
      System.out.println("links.api.events=" + root.getLinks().getApi().getEvents().getHref());
      System.out.println();
      List<Sport> sports = root.getSports();
      for (Sport sport : sports) {
         try {
            System.out.println("id=" + sport.getId() + " name=" + sport.getName());
            System.out.println("links.api.news=" + sport.getLinks().getApi().getNews().getHref());
            System.out.println("links.api.headlines=" + sport.getLinks().getApi().getHeadlines().getHref());
            System.out.println("links.api.notes=" + sport.getLinks().getApi().getNotes().getHref());
            System.out.println("links.api.events=" + sport.getLinks().getApi().getEvents().getHref());
         }
         catch (Exception ex) {}
         System.out.println();
      }
   }
   
   public static String makeRequest() throws IOException {
      final URL url = new URL(requestUrl);
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

      StringBuilder response = new StringBuilder();
      final BufferedReader reader = new BufferedReader(inputStreamReader);
      String line = null;
      while ((line = reader.readLine()) != null) {
         response.append(line);
      }
      outputStreamWriter.close();
      reader.close();

      return response.toString();
   }
}
