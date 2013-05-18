package com.espn.api.sports.teams;

import com.espn.api.seasons.Season;

/**
 * Record class represents the record object in the ESPN APIs.
 */
public class Record {

   private String summary = null;
   private Integer wins = null;
   private Integer losses = null;
   private Integer overtimeLosses = null;
   private Integer ties = null;
   private Season season = null;
   
   /**
    * Initialize a new Record.
    */
   public Record() {
      super();
   }

   /**
    * Gets the summary property.
    * @return The summary property.
    */
   public String getSummary() {
      return summary;
   }

   /**
    * Gets the wins property.
    * @return The wins property.
    */
   public Integer getWins() {
      return wins;
   }

   /**
    * Gets the losses property.
    * @return The losses property.
    */
   public Integer getLosses() {
      return losses;
   }

   /**
    * Gets the overtimeLosses property.
    * @return The overtimeLosses property.
    */
   public Integer getOvertimeLosses() {
      return overtimeLosses;
   }

   /**
    * Gets the ties property.
    * @return The ties property.
    */
   public Integer getTies() {
      return ties;
   }

   /**
    * Gets the season property.
    * @return The season property.
    */
   public Season getSeason() {
      return season;
   }
}
