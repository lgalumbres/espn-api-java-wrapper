package com.espn.api.sports.headlines;

import java.util.Date;
import java.util.List;

import com.espn.api.medias.Audio;
import com.espn.api.medias.Image;
import com.espn.api.medias.Video;

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
   
   public Headline() {
      super();
   }

   public String getHeadline() {
      return headline;
   }

   public Date getLastModified() {
      return lastModified;
   }

   public Boolean getPremium() {
      return premium;
   }

   public String getShortLinkText() {
      return shortLinkText;
   }

   public String getType() {
      return type;
   }

   public Integer getId() {
      return id;
   }

   public String getStory() {
      return story;
   }

   public String getTitle() {
      return title;
   }

   public String getLinkText() {
      return linkText;
   }

   public String getByline() {
      return byline;
   }

   public String getSource() {
      return source;
   }

   public String getDescription() {
      return description;
   }

   public Date getPublished() {
      return published;
   }

   public List<String> getKeywords() {
      return keywords;
   }
   
   public HeadlineLinks getLinks() {
      return links;
   }
   
   public List<RelatedHeadline> getRelated() {
      return related;
   }
   
   public List<Image> getImages() {
      return images;
   }
   
   public List<Video> getVideos() {
      return video;
   }
   
   public List<Audio> getAudios() {
      return audio;
   }
   
   public List<Category> getCategories() {
      return categories;
   }
}
