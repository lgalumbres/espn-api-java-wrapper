package com.espn.api.leagues;

import com.espn.api.seasons.Season;
import com.espn.api.seasons.Week;

/**
 * League class represents the league object in the ESPN APIs.
 */
public class League {
   
   private String name = null;
   private String abbreviation = null;
   private Integer id = null;
   private Integer groupId = null;
   private String shortName = null;
   private Season season = null;
   private Week week = null;
   
   /**
    * Initialize a new league.
    */
   public League() {
      super();
   }

   /**
    * Gets the name of the league.
    * @return The name of the league.
    */
   public String getName() {
      return name;
   }

   /**
    * Gets the abbreviation of the league.
    * @return The abbreviation of the league.
    */
   public String getAbbreviation() {
      return abbreviation;
   }

   /**
    * Gets the sport id of the league.
    * @return The sport id of the league.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the group id of the league.
    * @return The group id of the league.
    */
   public Integer getGroupId() {
      return groupId;
   }

   /**
    * Gets the short name of the league.
    * @return The short name of the league.
    */
   public String getShortName() {
      return shortName;
   }
   
   /**
    * Gets the season object associated with the league.
    * @return The season object.
    */
   public Season getSeason() {
      return season;
   }
   
   /**
    * Gets the week object associated with the league.
    * @return The week object.
    */
   public Week getWeek() {
      return week;
   }
}
