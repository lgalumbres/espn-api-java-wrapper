package com.espn.api.samples;

import java.util.List;

import com.espn.api.sports.headlines.Headline;
import com.espn.api.sports.headlines.Headlines;
import com.espn.api.sports.headlines.HeadlinesAPI;

public class HeadlinesTest {

   public static void main(String[] args) {
      HeadlinesAPI headlinesAPI = new HeadlinesAPI(HeadlinesAPI.RESOURCE_BASKETBALL_NBA, HeadlinesAPI.METHOD_HEADLINES, 9248230);
      Headlines root = headlinesAPI.getAPIData();
      
      System.out.println("timeStamp=" + root.getTimestamp());
      System.out.println("status=" + root.getStatus());
      System.out.println("resultsLimit=" + root.getResultsLimit());
      System.out.println("resultsCount=" + root.getResultsCount());
      System.out.println("resultsOffset=" + root.getResultsOffset());
      
      List<Headline> headlines = root.getHeadlines();
      if (headlines != null && headlines.size() > 0) {
         for (Headline headline : headlines) {
            System.out.println(headline.getHeadline());
         }
      }
   }

}
