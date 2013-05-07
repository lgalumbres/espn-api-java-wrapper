package com.espn.api.sports.headlines;

import java.util.Map;

import com.espn.api.API;
import com.espn.api.InvalidMethodException;
import com.espn.api.InvalidResourceException;
import com.espn.api.sports.Sports;
import com.espn.api.sports.SportsAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HeadlinesAPI extends API<Headlines> {
   
   public static final String METHOD_NEWS = "/news";
   public static final String METHOD_HEADLINES = "/news/headlines";

   public HeadlinesAPI() {
      super(API.RESOURCE_SPORTS, HeadlinesAPI.METHOD_NEWS);
   }

   public HeadlinesAPI(String method) throws InvalidMethodException {
      super(API.RESOURCE_SPORTS, method);
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
   }
   
   public HeadlinesAPI(String method, Integer contentId) throws InvalidMethodException {
      super(API.RESOURCE_SPORTS, method);
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
      
      if (contentId != null) {
         this.reconfigureMethod(method.concat("/").concat(contentId.toString()));
      }
   }

   public HeadlinesAPI(String resource, String method) throws InvalidResourceException, InvalidMethodException {
      super(resource, method);
      
      if (!validResource && !isSupportedResource(HeadlinesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
   }
   
   public HeadlinesAPI(String resource, String method, Integer contentId) throws InvalidResourceException, InvalidMethodException {
      super(resource, method);
      
      if (!validResource && !isSupportedResource(HeadlinesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
      
      if (contentId != null) {
         this.reconfigureMethod(method.concat("/").concat(contentId.toString()));
      }
   }

   public HeadlinesAPI(String resource, String method, Map<String, String> params) throws InvalidResourceException, InvalidMethodException {
      super(resource, method, params);
      
      if (!validResource && !isSupportedResource(HeadlinesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
   }
   
   public HeadlinesAPI(String resource, String method, Integer contentId, Map<String, String> params) throws InvalidResourceException, InvalidMethodException {
      super(resource, method, params);
      
      if (!validResource && !isSupportedResource(HeadlinesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
      
      if (contentId != null) {
         this.reconfigureMethod(method.concat("/").concat(contentId.toString()));
      }
   }

   @Override
   public Headlines getAPIData() {
      GsonBuilder builder = new GsonBuilder();
      Gson gson = builder.create();
      // Deserialize the JSON string to a Headlines object.
      return gson.fromJson(this.getJsonResponse(), Headlines.class);
   }

}
