package com.espn.api.medias;

/**
 * Video class represents the video object in the ESPN APIs.
 */
public class Video {
   
   private Integer id = null;
   private String title = null;
   private String thumbnail = null;
   private String description = null;
   private MediaLinks links = null;

   /**
    * Initialize a new video.
    */
   public Video() {
      super();
   }

   /**
    * Gets the video content Id.
    * @return The video content Id.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the video title.
    * @return The video title.
    */
   public String getTitle() {
      return title;
   }

   /**
    * Gets the video thumbnail.
    * @return The video thumbnail.
    */
   public String getThumbnail() {
      return thumbnail;
   }

   /**
    * Gets the video description.
    * @return The video description.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the links associated with the video.
    * @return The links associated with the video.
    */
   public MediaLinks getLinks() {
      return links;
   }
}
