package com.espn.api.links;

/**
 * Base link class that all link classes extend.
 */
public class Link {
   
   private String href = null;
   
   /**
    * Initialize a new link.
    */
   public Link() {
      super();
   }
   
   /**
    * Returns the link URL.
    * @return The link URL.
    */
   public String getHref() {
      return href;
   }

}
