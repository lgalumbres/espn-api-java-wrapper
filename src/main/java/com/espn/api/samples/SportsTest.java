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

import com.espn.api.API;
import com.espn.api.leagues.League;
import com.espn.api.seasons.Season;
import com.espn.api.seasons.Week;
import com.espn.api.sports.Sport;
import com.espn.api.sports.Sports;
import com.espn.api.sports.SportsAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class SportsTest {
   
   public static void main(String[] args) throws JsonSyntaxException, IOException {
      SportsAPI sportsApi = new SportsAPI(SportsAPI.RESOURCE_SOCCER);
      Sports root = sportsApi.getAPIData();
      
      if (root.getLinks() != null) {
         System.out.println("links.api.news=" + root.getLinks().getApi().getNews().getHref());
         System.out.println("links.api.headlines=" + root.getLinks().getApi().getHeadlines().getHref());
         System.out.println("links.api.notes=" + root.getLinks().getApi().getNotes().getHref());
         System.out.println("links.api.events=" + root.getLinks().getApi().getEvents().getHref());
      }
      
      System.out.println();
      List<Sport> sports = root.getSports();
      for (Sport sport : sports) {
         try {
            System.out.println("id=" + sport.getId() + " name=" + sport.getName());
            
            List<League> leagues = sport.getLeagues();
            if (leagues != null && leagues.size() > 0) {
               for (League league : leagues) {
                  System.out.println("League: name=" + league.getName() + " abbrev=" + league.getAbbreviation() + " id=" + league.getId() + " groupId=" + league.getGroupId() + " shortName=" + league.getShortName());
                  Season season = league.getSeason();
                  if (season != null) {
                     System.out.println("Season: year=" + season.getYear() + " type=" + season.getTypeAsInteger() + " description=" + season.getDescription() + " startDate=" + season.getStartDate() + " endDate=" + season.getEndDate());
                  }
                  
                  Week week = league.getWeek();
                  if (week != null) {
                     System.out.println("Week: number=" + week.getNumber() + " startDate=" + week.getStartDate() + " endDate=" + week.getEndDate());
                  }
               }
            }
            
            System.out.println("links.api.news=" + sport.getLinks().getApi().getNews().getHref());
            System.out.println("links.api.headlines=" + sport.getLinks().getApi().getHeadlines().getHref());
            System.out.println("links.api.notes=" + sport.getLinks().getApi().getNotes().getHref());
            System.out.println("links.api.events=" + sport.getLinks().getApi().getEvents().getHref());
         }
         catch (Exception ex) {}
         System.out.println();
      }
      
      //magicMethod(API.class);
   }
   
   public static void magicMethod(Class<?> c) {
      Field[] fields = c.getDeclaredFields();
      for (Field field : fields) {
         try {
            if (field.getName().startsWith("RESOURCE")) {
               System.out.println(field.getName() + "=" + field.get(null));
            }
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}
