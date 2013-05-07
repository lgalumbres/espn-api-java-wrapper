package com.espn.api.sports.headlines;

public class Category {
   
   private String description = null;
   private String type = null;
   private Integer sportId = null;
   private Integer leagueId = null;
   private Integer athleteId = null;
   private Integer teamId = null;

   public Category() {
      super();
   }

   public String getDescription() {
      return description;
   }

   public String getType() {
      return type;
   }

   public Integer getSportId() {
      return sportId;
   }
   
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
