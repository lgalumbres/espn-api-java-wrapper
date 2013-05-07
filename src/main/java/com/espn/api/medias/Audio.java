package com.espn.api.medias;

/**
 * Audio class represents the audio object in the ESPN APIs.
 */
public class Audio {

   private Integer id = null;
   private String title = null;
   private String description = null;
   private MediaLinks links = null;
   
   /**
    * Initialize a new audio.
    */
   public Audio() {
      super();
   }

   /**
    * Gets the audio content Id.
    * @return The audio content Id.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the title.
    * @return The title.
    */
   public String getTitle() {
      return title;
   }

   /**
    * Gets the description.
    * @return The description.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the links associated with this audio.
    * @return The links associated with this audio.
    */
   public MediaLinks getLinks() {
      return links;
   }
}
