package com.espn.api.sports;

import java.util.List;

import com.espn.api.leagues.League;

/**
 * Sport class that represents the sport object in the ESPN APIs.
 */
public class Sport {
   
   private Integer id = null;
   private String name = null;
   private SportsLinks links = null;
   private List<League> leagues = null;
   
   /**
    * Initialize a new sport.
    */
   public Sport() {
      super();
   }
   
   /**
    * Gets the id of the sport.
    * @return The id.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the name of the sport.
    * @return The name.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Gets the links for the sport.
    * @return The links.
    */
   public SportsLinks getLinks() {
      return links;
   }
   
   /**
    * Gets the leagues for the sport.
    * @return The leagues.
    */
   public List<League> getLeagues() {
      return leagues;
   }
}
