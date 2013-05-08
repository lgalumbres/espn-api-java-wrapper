package com.espn.api.sports.headlines;

/**
 * RelatedHeadline class represents the related object in the Headlines API.
 */
public class RelatedHeadline {
   
   private Integer id = null;
   private String title = null;
   private HeadlineLinks links = null;

   /**
    * Initialize a new related headline.
    */
   public RelatedHeadline() {
      super();
   }

   /**
    * Gets the content Id.
    * @return The content Id.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the title of the related headline.
    * @return The title of the related headline.
    */
   public String getTitle() {
      return title;
   }

   /**
    * Gets the links associated with the related headline.
    * @return The links associated with the related headline.
    */
   public HeadlineLinks getLinks() {
      return links;
   }
}
