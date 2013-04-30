package com.espn.api.sports;

import java.util.List;

public class Sports {
   
   private List<Sport> sports = null;
   private SportsLinks links = null;

   public Sports() {
      super();
   }

   public List<Sport> getSports() {
      return sports;
   }
   
   public SportsLinks getLinks() {
      return links;
   }
}
