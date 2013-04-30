package com.espn.api.links;

public class APILinks {

   private SportsLink sports = null;
   private NewsLink news = null;
   private NotesLink notes = null;
   private HeadlinesLink headlines = null;
   private EventsLink events = null;
   
   public APILinks() {
      super();
   }

   public SportsLink getSports() {
      return sports;
   }

   public NewsLink getNews() {
      return news;
   }

   public NotesLink getNotes() {
      return notes;
   }

   public HeadlinesLink getHeadlines() {
      return headlines;
   }

   public EventsLink getEvents() {
      return events;
   }   
}
