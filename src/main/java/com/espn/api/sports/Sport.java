package com.espn.api.sports;

public class Sport {
   
   private Integer id = null;
   private String name = null;
   private SportsLinks links = null;
   
   public Sport() {
      super();
   }
   
   public Integer getId() {
      return id;
   }

   public String getName() {
      return name;
   }
   
   public SportsLinks getLinks() {
      return links;
   }
}
