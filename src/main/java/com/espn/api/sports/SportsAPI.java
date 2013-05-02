package com.espn.api.sports;

import com.espn.api.API;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SportsAPI extends API<Sports> {

   public SportsAPI() {
      super();
   }
   
   @Override
   public Sports getAPIData() {
      GsonBuilder builder = new GsonBuilder();
      Gson gson = builder.create();
      return gson.fromJson(this.getJsonResponse(), Sports.class);
   }
}
