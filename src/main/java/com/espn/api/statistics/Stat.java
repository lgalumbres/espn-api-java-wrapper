package com.espn.api.statistics;

/**
 * Stat class represents the stat object in the ESPN APIs.
 */
public class Stat {

   private String name = null;
   private String description = null;
   private Object value = null;
   private String abbreviation = null;
   
   /**
    * Initialize a new Stat.
    */
   public Stat() {
      super();
   }

   /**
    * Gets the name property.
    * @return The name property.
    */
   public String getName() {
      return name;
   }

   /**
    * Gets the description property.
    * @return The description property.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the value property.
    * @return The value property.
    */
   public Object getValue() {
      return value;
   }

   /**
    * Gets the abbreviation property.
    * @return The abbreviation property.
    */
   public String getAbbreviation() {
      return abbreviation;
   }
}
