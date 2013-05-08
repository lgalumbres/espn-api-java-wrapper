package com.espn.api.sports.headlines;

import java.util.Map;

import com.espn.api.API;
import com.espn.api.InvalidMethodException;
import com.espn.api.InvalidResourceException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * HeadlinesAPI class represents the Headlines ESPN API.
 * 
 * <br/>
 * <br/>
 * <strong>Sample Usages:</strong>
 * <pre>
 * {@code
 * // Default constructor makes a request to /sports/news endpoint.
 * HeadlinesAPI api = new HeadlinesAPI();
 * Headlines apiRoot = api.getAPIData();
 * 
 * // The following example makes a request to /sports/basketball/nba/news/headlines endpoint.
 * HeadlinesAPI api = new HeadlinesAPI(HeadlinesAPI.RESOURCE_BASKETBALL_NBA, HeadlinesAPI.METHOD_HEADLINES);
 * Headlines apiRoot = api.getAPIData();
 * 
 * // The following example makes a request to /sports/baseball/mlb/news?lang=es&region=MX endpoint.
 * Map<String, String> params = new HashMap<String, String>();
 * params.put("lang", "es");
 * params.put("region", "MX");
 * HeadlinesAPI api = new HeadlinesAPI(HeadlinesAPI.RESOURCE_BASEBALL_MLB, HeadlinesAPI.METHOD_NEWS, params);
 * Headlines apiRoot = api.getAPIData();
 * }
 * <pre>
 */
public class HeadlinesAPI extends API<Headlines> {
   
   public static final String METHOD_NEWS = "/news";
   public static final String METHOD_HEADLINES = "/news/headlines";

   /**
    * Initialize a new headlines API.
    */
   public HeadlinesAPI() {
      super(API.RESOURCE_SPORTS, HeadlinesAPI.METHOD_NEWS);
   }

   /**
    * Initialize a new headlines API with a specified method.
    * @param method The method.
    * @throws InvalidMethodException Thrown when the method is invalid.
    */
   public HeadlinesAPI(String method) throws InvalidMethodException {
      super(API.RESOURCE_SPORTS, method);
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
   }
   
   /**
    * Initialize a new headlines API with a specified method and content Id.
    * @param method The method.
    * @param contentId The content Id.
    * @throws InvalidMethodException Thrown when the method is invalid.
    */
   public HeadlinesAPI(String method, Integer contentId) throws InvalidMethodException {
      super(API.RESOURCE_SPORTS, method);
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
      
      if (contentId != null) {
         this.reconfigureMethod(method.concat("/").concat(contentId.toString()));
      }
   }

   /**
    * Initialize a new headlines API with a specified resource and method.
    * @param resource The resource.
    * @param method The method.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    * @throws InvalidMethodException Thrown when the method is invalid.
    */
   public HeadlinesAPI(String resource, String method) throws InvalidResourceException, InvalidMethodException {
      super(resource, method);
      
      if (!validResource && !isSupportedResource(HeadlinesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
   }
   
   /**
    * Initialize a new headlines API with a specified resource, method and contentId.
    * @param resource The resource.
    * @param method The method.
    * @param contentId The contentId.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    * @throws InvalidMethodException Thrown when the method is invalid.
    */
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

   /**
    * Initialize a new headlines API with a specified resource, method and parameters.
    * @param resource The resource.
    * @param method The method.
    * @param params The key-value pair of parameters.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    * @throws InvalidMethodException Thrown when the method is invalid.
    */
   public HeadlinesAPI(String resource, String method, Map<String, String> params) throws InvalidResourceException, InvalidMethodException {
      super(resource, method, params);
      
      if (!validResource && !isSupportedResource(HeadlinesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (!validMethod && !isSupportedMethod(HeadlinesAPI.class, method)) {
         throw new InvalidResourceException("The API method '" + method + "' does not exists in the Headlines API.");
      }
   }
   
   /**
    * Initialize a new headlines API with a specified resource, method, content Id and parameters.
    * @param resource The resource.
    * @param method The method.
    * @param contentId The content Id.
    * @param params The key-value pair of parameters.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    * @throws InvalidMethodException Thrown when the method is invalid.
    */
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

   /**
    * Method to retrieve the API data in Java representation.
    * @return The Headlines data.
    */
   @Override
   public Headlines getAPIData() {
      GsonBuilder builder = new GsonBuilder();
      Gson gson = builder.create();
      // Deserialize the JSON string to a Headlines object.
      return gson.fromJson(this.getJsonResponse(), Headlines.class);
   }

}
