package com.espn.api.sports.research;

import java.util.Map;

import com.espn.api.API;
import com.espn.api.InvalidResourceException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * NotesAPI class represents the Research Notes ESPN API.
 * 
 * <br/>
 * <br/>
 * <strong>Sample Usages:</strong>
 * <pre>
 * {@code
 * // Default constructor makes a request to /sports/news/notes endpoint.
 * NotesAPI api = new NotesAPI();
 * Notes apiRoot = api.getAPIData();
 * 
 * // The following example makes a request to /sports/basketball/nba/news/notes endpoint.
 * NotesAPI api = new NotesAPI(NotesAPI.RESOURCE_BASKETBALL_NBA);
 * Notes apiRoot = api.getAPIData();
 * 
 * // The following example makes a request to /sports/baseball/mlb/news/notes?dates=201305 endpoint.
 * Map<String, String> params = new HashMap<String, String>();
 * params.put("dates", "201305");
 * NotesAPI api = new NotesAPI(NotesAPI.RESOURCE_BASEBALL_MLB, params);
 * Notes apiRoot = api.getAPIData();
 * }
 * <pre>
 */
public class NotesAPI extends API<Notes> {
   
   private static final String METHOD_NOTES = "/news/notes";

   /**
    * Initialize a new research notes API.
    */
   public NotesAPI() {
      super(API.RESOURCE_SPORTS, METHOD_NOTES);
   }

   /**
    * Initialize a new research notes API with a specified resource.
    * @param resource The resource.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    */
   public NotesAPI(String resource) throws InvalidResourceException {
      super(resource, METHOD_NOTES);
      
      if (!validResource && !isSupportedResource(NotesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
   }
   
   /**
    * Initialize a new research notes API with a specified resource and parameters.
    * @param resource The resource.
    * @param params The key-value pair of parameters.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    */
   public NotesAPI(String resource, Map<String, String> params) throws InvalidResourceException {
      super(resource, METHOD_NOTES, params);
      
      if (!validResource && !isSupportedResource(NotesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
   }
   
   /**
    * Initialize a new research notes API with a specified resource, content Id and parameters.
    * @param resource The resource.
    * @param contentId The content Id.
    * @param params The key-value pair of parameters.
    * @throws InvalidResourceException Thrown when the resource is invalid.
    */
   public NotesAPI(String resource, Integer contentId, Map<String, String> params) throws InvalidResourceException {
      super(resource, METHOD_NOTES, params);
      
      if (!validResource && !isSupportedResource(NotesAPI.class, resource)) {
         throw new InvalidResourceException("The API resource '" + resource + "' does not exists.");
      }
      
      if (contentId != null) {
         this.reconfigureMethod(METHOD_NOTES.concat("/").concat(contentId.toString()));
      }
   }

   /**
    * Method to retrieve the API data in Java representation.
    * @return The Notes data.
    */
   @Override
   public Notes getAPIData() {
      GsonBuilder builder = new GsonBuilder();
      Gson gson = builder.create();
      return gson.fromJson(this.getJsonResponse(), Notes.class);
   }

}
