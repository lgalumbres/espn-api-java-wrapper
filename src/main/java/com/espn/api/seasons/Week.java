package com.espn.api.seasons;

import java.util.Date;

/**
 * Week class represents the week object in the ESPN APIs.
 */
public class Week {
   
   private Integer number = null;
   private Date startDate = null;
   private Date endDate = null;

   /**
    * Initialize a new week.
    */
   public Week() {
      super();
   }

   /**
    * Gets the week number.
    * @return The week number.
    */
   public Integer getNumber() {
      return number;
   }

   /**
    * Gets the start date for the week.
    * @return The start date for the week.
    */
   public Date getStartDate() {
      return startDate;
   }

   /**
    * Gets the end date for the week.
    * @return The end date for the week.
    */
   public Date getEndDate() {
      return endDate;
   }
}
