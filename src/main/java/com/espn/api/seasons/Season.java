package com.espn.api.seasons;

import java.util.Date;

/**
 * Season class represents the season object in the ESPN APIs.
 */
public class Season {
   
   private Integer year = null;
   private Integer type = null;
   private String description = null;
   private Date startDate = null;
   private Date endDate = null;

   /**
    * Initialize a new season.
    */
   public Season() {
      super();
   }

   /**
    * Gets the year for the season.
    * @return The year for the season.
    */
   public Integer getYear() {
      return year;
   }
   
   /**
    * Gets the season type (i.e. pre season, regular season, post season).
    * @return The season type.
    */
   public SeasonType getType() {
      SeasonType st = null;
      switch (type) {
         case 1:
            st = SeasonType.PRE;
            break;
         case 2:
            st = SeasonType.REG;
            break;
         case 3:
            st = SeasonType.POST;
      }
      return st;
   }

   /**
    * Gets the season type as integer representation.
    * @return The integer representation of the season type.
    */
   public Integer getTypeAsInteger() {
      return type;
   }

   /**
    * Gets the season description.
    * @return The season description.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the start date for the season.
    * @return The start date for the season.
    */
   public Date getStartDate() {
      return startDate;
   }

   /**
    * Gets the end date for the season.
    * @return The end date for the season.
    */
   public Date getEndDate() {
      return endDate;
   }
}
