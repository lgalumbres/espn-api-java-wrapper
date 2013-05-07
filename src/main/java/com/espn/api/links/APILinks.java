package com.espn.api.links;

/**
 * APILinks class represents the links in the links.api node.
 */
public class APILinks {

   private SportsLink sports = null;
   private NewsLink news = null;
   private NotesLink notes = null;
   private HeadlinesLink headlines = null;
   private EventsLink events = null;
   private VideoLink video = null;
   private AudioLink audio = null;
   
   /**
    * Initialize a new links class.
    */
   public APILinks() {
      super();
   }

   /**
    * Returns the sports API link.
    * @return The sports API link.
    */
   public SportsLink getSports() {
      return sports;
   }

   /**
    * Returns the news API link.
    * @return The news API link.
    */
   public NewsLink getNews() {
      return news;
   }

   /**
    * Returns the notes API link.
    * @return The notes API link.
    */
   public NotesLink getNotes() {
      return notes;
   }

   /**
    * Returns the headlines API link.
    * @return The headlines API link.
    */
   public HeadlinesLink getHeadlines() {
      return headlines;
   }

   /**
    * Returns the events API link.
    * @return The events API link.
    */
   public EventsLink getEvents() {
      return events;
   }
   
   /**
    * Returns the video API link.
    * @return The video API link.
    */
   public VideoLink getVideo() {
      return video;
   }
   
   /**
    * Returns the audio API link.
    * @return The audio API link.
    */
   public AudioLink getAudio() {
      return audio;
   }
}
