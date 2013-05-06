package com.espn.api.sports.headlines;

import java.util.Date;
import java.util.List;

public class Headlines {
   
   private Date timestamp = null;
   private Integer resultsOffset = null;
   private Integer resultsLimit = null;
   private Integer resultsCount = null;
   private String status = null;
   private List<Headline> headlines = null;

   public Headlines() {
      super();
   }

   public Date getTimestamp() {
      return timestamp;
   }

   public Integer getResultsOffset() {
      return resultsOffset;
   }

   public Integer getResultsLimit() {
      return resultsLimit;
   }

   public Integer getResultsCount() {
      return resultsCount;
   }

   public String getStatus() {
      return status;
   }

   public List<Headline> getHeadlines() {
      return headlines;
   }
}
