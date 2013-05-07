package com.espn.api.medias;

/**
 * Image class represents the image object in the ESPN APIs.
 */
public class Image {
   
   private Integer height = null;
   private String alt = null;
   private Integer width = null;
   private String name = null;
   private String caption = null;
   private String type = null;
   private String credit = null;
   private String url = null;

   /**
    * Initialize a new image.
    */
   public Image() {
      super();
   }

   /**
    * Gets the image height.
    * @return The image height.
    */
   public Integer getHeight() {
      return height;
   }

   /**
    * Gets the image alt.
    * @return The image alt.
    */
   public String getAlt() {
      return alt;
   }

   /**
    * Gets the image width.
    * @return The image width.
    */
   public Integer getWidth() {
      return width;
   }

   /**
    * Gets the image name.
    * @return The image name.
    */
   public String getName() {
      return name;
   }

   /**
    * Gets the image caption.
    * @return The image caption.
    */
   public String getCaption() {
      return caption;
   }

   /**
    * Gets the image type.
    * @return The image type.
    */
   public String getType() {
      return type;
   }

   /**
    * Gets the image credit.
    * @return The image credit.
    */
   public String getCredit() {
      return credit;
   }

   /**
    * Gets the image URL.
    * @return The image URL.
    */
   public String getUrl() {
      return url;
   }
}
