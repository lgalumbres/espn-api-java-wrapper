package com.espn.api.sports;

/**
 * Sport class that represents the sport node in the ESPN APIs.
 */
public class Sport {
   
   private Integer id = null;
   private String name = null;
   private SportsLinks links = null;
   
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
}
