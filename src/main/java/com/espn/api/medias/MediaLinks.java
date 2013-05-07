package com.espn.api.medias;

import com.espn.api.links.APILinks;
import com.espn.api.links.WebLink;

/**
 * MediaLinks class represents the links node for the video and audio objects in the ESPN APIs.
 */
public class MediaLinks {
   
   private APILinks api = null;
   private WebLink web = null;

   /**
    * Initialize a new media links.
    */
   public MediaLinks() {
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
}
