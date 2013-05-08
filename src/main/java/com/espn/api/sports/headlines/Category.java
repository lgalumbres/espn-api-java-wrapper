package com.espn.api.sports.headlines;

/**
 * Category class represents the category object in the Headlines API.
 */
public class Category {
   
   private String description = null;
   private String type = null;
   private Integer sportId = null;
   private Integer leagueId = null;
   private Integer athleteId = null;
   private Integer teamId = null;

   /**
    * Initialize a new category.
    */
   public Category() {
      super();
   }

   /**
    * Gets the description.
    * @return The description.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the type of category.
    * @return The type of category.
    */
   public String getType() {
      return type;
   }

   /**
    * Gets the sport Id.
    * @return The sport Id.
    */
   public Integer getSportId() {
      return sportId;
   }
   
   /**
    * Gets the Id for the type of category (i.e athlete Id, team Id, league Id).
    * @return The Id for the type of category.
    */
   public Integer getId() {
      Integer id = null;
      if ("athlete".equalsIgnoreCase(type)) {
         id = athleteId;
      }
      else if ("team".equalsIgnoreCase(type)) {
         id = teamId;
      }
      else if ("league".equalsIgnoreCase(type)) {
         id = leagueId;
      }
      return id;
   }
}
