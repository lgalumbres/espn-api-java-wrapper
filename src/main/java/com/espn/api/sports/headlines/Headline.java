package com.espn.api.sports.headlines;

import java.util.Date;
import java.util.List;

import com.espn.api.medias.Audio;
import com.espn.api.medias.Image;
import com.espn.api.medias.Video;

/**
 * Headline class represents the headline object in the Headlines API.
 */
public class Headline {
   
   private String headline = null;
   private Date lastModified = null;
   private Boolean premium = null;
   private String shortLinkText = null;
   private String type = null;
   private Integer id = null;
   private String story = null;
   private String title = null;
   private String linkText = null;
   private String byline = null;
   private String source = null;
   private String description = null;
   private Date published = null;
   private List<String> keywords = null;
   private HeadlineLinks links = null;
   private List<RelatedHeadline> related = null;
   private List<Image> images = null;
   private List<Video> video = null;
   private List<Audio> audio = null;
   private List<Category> categories = null;
   
   /**
    * Initialize a new headline.
    */
   public Headline() {
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
    * Gets the lastModified property.
    * @return The lastModified property.
    */
   public Date getLastModified() {
      return lastModified;
   }

   /**
    * Gets the premium property.
    * @return The premium property.
    */
   public Boolean getPremium() {
      return premium;
   }

   /**
    * Gets the shortLinkText property.
    * @return The shortLinkText property.
    */
   public String getShortLinkText() {
      return shortLinkText;
   }

   /**
    * Gets the type property.
    * @return The type property.
    */
   public String getType() {
      return type;
   }

   /**
    * Gets the id property.
    * @return The id property.
    */
   public Integer getId() {
      return id;
   }

   /**
    * Gets the story property.
    * @return The story property.
    */
   public String getStory() {
      return story;
   }

   /**
    * Gets the title property.
    * @return The title property.
    */
   public String getTitle() {
      return title;
   }

   /**
    * Gets the linkText property.
    * @return The linkText property.
    */
   public String getLinkText() {
      return linkText;
   }

   /**
    * Gets the byline property.
    * @return The byline property.
    */
   public String getByline() {
      return byline;
   }

   /**
    * Gets the source property.
    * @return The source property.
    */
   public String getSource() {
      return source;
   }

   /**
    * Gets the description property.
    * @return The description property.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the published property.
    * @return The published property.
    */
   public Date getPublished() {
      return published;
   }

   /**
    * Gets the keywords property.
    * @return The keywords property.
    */
   public List<String> getKeywords() {
      return keywords;
   }
   
   /**
    * Gets the links property.
    * @return The links property.
    */
   public HeadlineLinks getLinks() {
      return links;
   }
   
   /**
    * Gets the related property.
    * @return The related property.
    */
   public List<RelatedHeadline> getRelated() {
      return related;
   }
   
   /**
    * Gets the images property.
    * @return The images property.
    */
   public List<Image> getImages() {
      return images;
   }
   
   /**
    * Gets the video property.
    * @return The video property.
    */
   public List<Video> getVideos() {
      return video;
   }
   
   /**
    * Gets the audio property.
    * @return The audio property.
    */
   public List<Audio> getAudios() {
      return audio;
   }
   
   /**
    * Gets the categories property.
    * @return The categories property.
    */
   public List<Category> getCategories() {
      return categories;
   }
}
