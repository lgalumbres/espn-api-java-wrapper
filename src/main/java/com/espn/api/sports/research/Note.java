package com.espn.api.sports.research;

import java.util.Date;
import java.util.List;

import com.espn.api.sports.headlines.Category;

/**
 * Note class represents the note object in the research notes API.
 */
public class Note {

   private String headline = null;
   private Integer id = null;
   private String text = null;
   private String source = null;
   private List<Category> categories = null;
   private Date date = null;
   private String type = null;
   
   /**
    * Initialize a new note.
    */
   public Note() {
      super();
   }

   /**
    * Gets the headline property.
    * @return The headline property.
    */
   public String getHeadline() {
      return headline;
   }

   /**
    * Gets the id property.
    * @return The id property.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the text property.
    * @return The text property.
    */
   public String getText() {
      return text;
   }

   /**
    * Gets the source property.
    * @return The source property.
    */
   public String getSource() {
      return source;
   }

   /**
    * Gets the categories property.
    * @return The categories property.
    */
   public List<Category> getCategories() {
      return categories;
   }

   /**
    * Gets the date property.
    * @return The date property.
    */
   public Date getDate() {
      return date;
   }

   /**
    * Gets the type property.
    * @return The type property.
    */
   public String getType() {
      return type;
   }
}
