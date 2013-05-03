package com.espn.api.sports;

import com.espn.api.links.APILinks;

/**
 * SportsLinks class that represent the sports root links.
 */
public class SportsLinks {
   private APILinks api = null;
   
   /**
    * Initialize a new SportsLinks.
    */
   public SportsLinks() {
      super();
   }

   /**
    * Returns the API links.
    * @return The API links.
    */
   public APILinks getApi() {
      return api;
   }
}
