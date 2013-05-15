package com.espn.api.sports.teams;

import java.util.Date;
import java.util.List;

/**
 * Teams class represents the root teams ESPN API.
 */
public class Teams {
   
   private Date timestamp = null;
   private Integer resultsOffset = null;
   private Integer resultsLimit = null;
   private Integer resultsCount = null;
   private String status = null;
   private List<Team> teams = null;

   /**
    * Initialize a new teams.
    */
   public Teams() {
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
    * Gets the resultsOffset property.
    * @return The resultsOffset property.
    */
   public Integer getResultsOffset() {
      return resultsOffset;
   }

   /**
    * Gets the resultsLimit property.
    * @return The resultsLimit property.
    */
   public Integer getResultsLimit() {
      return resultsLimit;
   }

   /**
    * Gets the resultsCount property.
    * @return The resultsCount property.
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
    * Gets the teams property.
    * @return The teams property.
    */
   public List<Team> getTeams() {
      return teams;
   }
}
