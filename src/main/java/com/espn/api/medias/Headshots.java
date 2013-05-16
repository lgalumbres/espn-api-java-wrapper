package com.espn.api.medias;

/**
 * Headshots class represents the headshots object in the ESPN APIs.
 */
public class Headshots {

   private Headshot full = null;
   private Headshot large = null;
   private Headshot medium = null;
   private Headshot small = null;
   private Headshot xsmall = null;
   private Headshot fantasy = null;
   private Headshot gamecast = null;
   
   /**
    * Initialize a new headshots.
    */
   public Headshots() {
      super();
   }

   /**
    * Gets the full property.
    * @return The full property.
    */
   public Headshot getFull() {
      return full;
   }

   /**
    * Gets the large property.
    * @return The large property.
    */
   public Headshot getLarge() {
      return large;
   }

   /**
    * Gets the medium property.
    * @return The medium property.
    */
   public Headshot getMedium() {
      return medium;
   }

   /**
    * Gets the small property.
    * @return The small property.
    */
   public Headshot getSmall() {
      return small;
   }

   /**
    * Gets the xsmall property.
    * @return The xsmall property.
    */
   public Headshot getXsmall() {
      return xsmall;
   }

   /**
    * Gets the fantasy property.
    * @return The fantasy property.
    */
   public Headshot getFantasy() {
      return fantasy;
   }

   /**
    * Gets the gamecast property.
    * @return The gamecast property.
    */
   public Headshot getGamecast() {
      return gamecast;
   }
}
