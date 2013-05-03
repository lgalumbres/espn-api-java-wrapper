package com.espn.api.sports;

import com.espn.api.API;
import com.espn.api.InvalidResourceException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SportsAPI extends API<Sports> {

   public SportsAPI() {
      super(API.RESOURCE_SPORTS);
   }
   
   public SportsAPI(String resource) throws InvalidResourceException {
      super(resource);
   }
   
   @Override
   public Sports getAPIData() {
      GsonBuilder builder = new GsonBuilder();
      Gson gson = builder.create();
      return gson.fromJson(this.getJsonResponse(), Sports.class);
   }
}
