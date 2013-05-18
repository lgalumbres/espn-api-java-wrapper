package com.espn.api.sports.teams;

import java.util.List;

import com.espn.api.medias.Logos;
import com.espn.api.statistics.Statistic;

/**
 * Team class represents the team object in the ESPN APIs.
 */
public class Team {

   private Integer id = null;
   private String location = null;
   private String name = null;
   private String nickname = null;
   private String abbreviation = null;
   private String color = null;
   private Logos logos = null;
   private Record record = null;
   private TeamLinks links = null;
   private List<Statistic> statistics = null;
   
   /**
    * Initialize a new Team.
    */
   public Team() {
      super();
   }

   /**
    * Gets the id property.
    * @return The id property.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the location property.
    * @return The location property.
    */
   public String getLocation() {
      return location;
   }

   /**
    * Gets the name property.
    * @return The name property.
    */
   public String getName() {
      return name;
   }

   /**
    * Gets the nickname property.
    * @return The nickname property.
    */
   public String getNickname() {
      return nickname;
   }

   /**
    * Gets the abbreviation property.
    * @return The abbreviation property.
    */
   public String getAbbreviation() {
      return abbreviation;
   }

   /**
    * Gets the color property.
    * @return The color property.
    */
   public String getColor() {
      return color;
   }

   /**
    * Gets the logos property.
    * @return The logos property.
    */
   public Logos getLogos() {
      return logos;
   }

   /**
    * Gets the record property.
    * @return The record property.
    */
   public Record getRecord() {
      return record;
   }

   /**
    * Gets the links property.
    * @return The links property.
    */
   public TeamLinks getLinks() {
      return links;
   }

   /**
    * Gets the statistics property.
    * @return The statistics property.
    */
   public List<Statistic> getStatistics() {
      return statistics;
   }
}
