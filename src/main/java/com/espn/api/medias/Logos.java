package com.espn.api.medias;

/**
 * Logos class represents the logos object in the ESPN APIs.
 */
public class Logos {

   private Logo full = null;
   private Logo large = null;
   private Logo medium = null;
   private Logo small = null;
   private Logo xsmall = null;
   private Logo xxsmall = null;
   
   /**
    * Initialize a new Logos.
    */
   public Logos() {
      super();
   }

   /**
    * Gets the full property.
    * @return The full property.
    */
   public Logo getFull() {
      return full;
   }

   /**
    * Gets the large property.
    * @return The large property.
    */
   public Logo getLarge() {
      return large;
   }

   /**
    * Gets the medium property.
    * @return The medium property.
    */
   public Logo getMedium() {
      return medium;
   }

   /**
    * Gets the small property.
    * @return The small property.
    */
   public Logo getSmall() {
      return small;
   }

   /**
    * Gets the xsmall property.
    * @return The xsmall property.
    */
   public Logo getXsmall() {
      return xsmall;
   }

   /**
    * Gets the xxsmall property.
    * @return The xxsmall property.
    */
   public Logo getXxsmall() {
      return xxsmall;
   }
}
