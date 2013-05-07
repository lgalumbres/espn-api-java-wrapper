package com.espn.api.sports.headlines;

import com.espn.api.links.APILinks;
import com.espn.api.links.MobileLink;
import com.espn.api.links.WebLink;

/**
 * HeadlineLinks class represents the links node in the Headlines API.
 */
public class HeadlineLinks {
   
   private APILinks api = null;
   private WebLink web = null;
   private MobileLink mobile = null;
   
   /**
    * Initialize a new headlines links.
    */
   public HeadlineLinks() {
      super();
   }

   /**
    * Gets the API links.
    * @return The API links.
    */
   public APILinks getApi() {
      return api;
   }

   /**
    * Gets the web links.
    * @return The web links.
    */
   public WebLink getWeb() {
      return web;
   }

   /**
    * Gets the mobile links.
    * @return The mobile links.
    */
   public MobileLink getMobile() {
      return mobile;
   }
}
