package com.espn.api.medias;

/**
 * MediaDef class is the base class that logo, headshot and flag objects extend.
 */
public abstract class MediaDef {
   
   private String href = null;
   private Integer width = null;
   private Integer height = null;

   /**
    * Initialize a new MediaDef.
    */
   public MediaDef() {
      super();
   }

   /**
    * Gets the href property.
    * @return The href property.
    */
   public String getHref() {
      return href;
   }

   /**
    * Gets the width property.
    * @return The width property.
    */
   public Integer getWidth() {
      return width;
   }

   /**
    * Gets the height property.
    * @return The height property.
    */
   public Integer getHeight() {
      return height;
   }
}
