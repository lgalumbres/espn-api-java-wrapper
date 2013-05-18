package com.espn.api.statistics;

import java.util.List;

import com.espn.api.seasons.Season;

/**
 * Statistic class represents the statistic object in the ESPN APIs.
 */
public class Statistic {

   private Season season = null;
   private List<StatCategory> statCategories = null;
   
   /**
    * Initialize a new Statistic.
    */
   public Statistic() {
      super();
   }

   /**
    * Gets the season property.
    * @return The season property.
    */
   public Season getSeason() {
      return season;
   }

   /**
    * Gets the statsCategories property.
    * @return The statCategories property.
    */
   public List<StatCategory> getStatCategories() {
      return statCategories;
   }
}
