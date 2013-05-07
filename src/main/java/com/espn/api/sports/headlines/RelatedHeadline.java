package com.espn.api.sports.headlines;

public class RelatedHeadline {
   
   private Integer id = null;
   private String title = null;
   private HeadlineLinks links = null;

   public RelatedHeadline() {
      super();
   }

   public Integer getId() {
      return id;
   }

   public String getTitle() {
      return title;
   }

   public HeadlineLinks getLinks() {
      return links;
   }
}
