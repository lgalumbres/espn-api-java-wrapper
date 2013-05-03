package com.espn.api.sports;

import java.util.List;

/**
 * Sports class represents the sports ESPN API root.
 */
public class Sports {
   
   private List<Sport> sports = null;
   private SportsLinks links = null;

   /**
    * Initialize a new Sports root.
    */
   public Sports() {
      super();
   }

   /**
    * Returns a list of sports.
    * @return The list of sports.
    */
   public List<Sport> getSports() {
      return sports;
   }
   
   /**
    * Returns the sports links.
    * @return The sports links.
    */
   public SportsLinks getLinks() {
      return links;
   }
}
