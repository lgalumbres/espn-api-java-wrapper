package com.espn.api.sports.research;

import java.util.Date;
import java.util.List;

/**
 * Notes class represents the root research notes API root.
 */
public class Notes {

   private Date timestamp = null;
   private Integer resultsOffset = null;
   private Integer resultsLimit = null;
   private Integer resultsCount = null;
   private String status = null;
   private List<Note> notes = null;
   
   /**
    * Initialize a new notes.
    */
   public Notes() {
      super();
   }

   /**
    * Gets the timestamp property.
    * @return The timestamp property.
    */
   public Date getTimestamp() {
      return timestamp;
   }

   /**
    * Gets the resultsOffset property.
    * @return The resultsOffset property.
    */
   public Integer getResultsOffset() {
      return resultsOffset;
   }

   /**
    * Gets the resultsLimit property.
    * @return The resultsLimit property.
    */
   public Integer getResultsLimit() {
      return resultsLimit;
   }

   /**
    * Gets the resultsCount property.
    * @return The resultsCount property.
    */
   public Integer getResultsCount() {
      return resultsCount;
   }

   /**
    * Gets the status property.
    * @return The status property.
    */
   public String getStatus() {
      return status;
   }

   /**
    * Gets the notes property.
    * @return The notes property.
    */
   public List<Note> getNotes() {
      return notes;
   }
}
