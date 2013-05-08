package com.espn.api.sports.headlines;

import java.util.Date;
import java.util.List;

/**
 * Headlines class represent the Headlines ESPN API root.
 */
public class Headlines {
   
   private Date timestamp = null;
   private Integer resultsOffset = null;
   private Integer resultsLimit = null;
   private Integer resultsCount = null;
   private String status = null;
   private List<Headline> headlines = null;

   /**
    * Initialize a new headlines.
    */
   public Headlines() {
      super();
   }

   /**
    * Gets the timestamp property.
    * @return The timestamp property.
    */
   public Date getTimestamp() {
      return timestamp;
   }

   /**
    * Gets the headlines results offset.
    * @return The headlines results offset.
    */
   public Integer getResultsOffset() {
      return resultsOffset;
   }

   /**
    * Getst the headlines results limit.
    * @return The headlines results limit.
    */
   public Integer getResultsLimit() {
      return resultsLimit;
   }

   /**
    * Gets the headlines results count.
    * @return The headlines results count.
    */
   public Integer getResultsCount() {
      return resultsCount;
   }

   /**
    * Gets the status property.
    * @return The status property.
    */
   public String getStatus() {
      return status;
   }

   /**
    * Gets the list of headlines.
    * @return The list of headlines.
    */
   public List<Headline> getHeadlines() {
      return headlines;
   }
}
