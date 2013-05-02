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
import com.espn.api.sports.SportsAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class SportsTest {
   
   public static void main(String[] args) throws JsonSyntaxException, IOException {
      SportsAPI sportsApi = new SportsAPI();
      Sports root = sportsApi.getAPIData();
      
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
}
