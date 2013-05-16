package com.espn.api.medias;

/**
 * Flags class represents the flags object in the ESPN APIs.
 */
public class Flags {

   private Flag large = null;
   private Flag medium = null;
   private Flag small = null;
   private Flag xsmall = null;
   private Flag xxsmall = null;
   
   /**
    * Initialize a new Flags.
    */
   public Flags() {
      super();
   }

   /**
    * Gets the large flag property.
    * @return The large flag property.
    */
   public Flag getLarge() {
      return large;
   }

   /**
    * Gets the medium flag property.
    * @return The medium flag property.
    */
   public Flag getMedium() {
      return medium;
   }

   /**
    * Gets the small flag property.
    * @return The small flag property.
    */
   public Flag getSmall() {
      return small;
   }

   /**
    * Gets the xsmall flag property.
    * @return The xsmall flag property.
    */
   public Flag getXsmall() {
      return xsmall;
   }

   /**
    * Gets the xxsmall flag property.
    * @return The xxsmall flag property.
    */
   public Flag getXxsmall() {
      return xxsmall;
   }
}
