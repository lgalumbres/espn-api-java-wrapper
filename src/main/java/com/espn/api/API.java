package com.espn.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Properties;
import java.util.zip.GZIPInputStream;

/**
 * Base class that all API classes extend. This class cannot be directly instantiated.
 *
 * @param <T> The type returned by getAPIData().
 */
public abstract class API<T> {
   
   // Common API resources
   /**
    * API resource /sports.
    */
   public static final String RESOURCE_SPORTS = "/sports";
   /**
    * API resource /sports/baseball.
    */
   public static final String RESOURCE_BASEBALL = "/sports/baseball";
   /**
    * API resource /sports/baseball/mlb.
    */
   public static final String RESOURCE_BASEBALL_MLB = "/sports/baseball/mlb";
   /**
    * API resource /sports/basketball.
    */
   public static final String RESOURCE_BASKETBALL = "/sports/basketball";
   /**
    * API resource /sports/basketball/nba.
    */
   public static final String RESOURCE_BASKETBALL_NBA = "/sports/basketball/nba";
   /**
    * API resource /sports/basketball/wnba.
    */
   public static final String RESOURCE_BASKETBALL_WNBA = "/sports/basketball/wnba";
   /**
    * API resource /sports/basketball/mens-college-basketball.
    */
   public static final String RESOURCE_BASKETBALL_NCAAB = "/sports/basketball/mens-college-basketball";
   /**
    * API resource /sports/basketball/womens-college-basketball.
    */
   public static final String RESOURCE_BASKETBALL_NCAAW = "/sports/basketball/womens-college-basketball";
   /**
    * API resource /sports/football.
    */
   public static final String RESOURCE_FOOTBALL = "/sports/football";
   /**
    * API resource /sports/football/nfl.
    */
   public static final String RESOURCE_FOOTBALL_NFL = "/sports/football/nfl";
   /**
    * API resource /sports/hockey.
    */
   public static final String RESOURCE_HOCKEY = "/sports/hockey";
   /**
    * API resource /sports/hockey/nhl.
    */
   public static final String RESOURCE_HOCKEY_NHL = "/sports/hockey/nhl";
   /**
    * API resource /sports/soccer.
    */
   public static final String RESOURCE_SOCCER = "/sports/soccer";
   /**
    * API resource /sports/golf.
    */
   public static final String RESOURCE_GOLF = "/sports/golf";
   /**
    * API resource /sports/tennis.
    */
   public static final String RESOURCE_TENNIS = "/sports/tennis";
   /**
    * API resource /sports/mma.
    */
   public static final String RESOURCE_MMA = "/sports/mma";
   /**
    * API resource /sports/boxing.
    */
   public static final String RESOURCE_BOXING = "/sports/boxing";
   /**
    * API resource /sports/action-sports.
    */
   public static final String RESOURCE_XGAMES = "/sports/action-sports";
   /**
    * API resource /sports/action-sports/bmx.
    */
   public static final String RESOURCE_XGAMES_BMX = "/sports/action-sports/bmx";
   /**
    * API resource /sports/action-sports/motox.
    */
   public static final String RESOURCE_XGAMES_MOTOX = "/sports/action-sports/motox";
   /**
    * API resource /sports/action-sports/skateboarding.
    */
   public static final String RESOURCE_XGAMES_SKATEBOARDING = "/sports/action-sports/skateboarding";
   /**
    * API resource /sports/action-sports/skiing.
    */
   public static final String RESOURCE_XGAMES_SKIING = "/sports/action-sports/skiing";
   /**
    * API resource /sports/action-sports/snowboarding.
    */
   public static final String RESOURCE_XGAMES_SNOWBOARDING = "/sports/action-sports/snowboarding";
   /**
    * API resource /sports/action-sports/snowmobiling.
    */
   public static final String RESOURCE_XGAMES_SNOWMOBILING = "/sports/action-sports/snowmobiling";
   /**
    * API resource /sports/action-sports/surfing.
    */
   public static final String RESOURCE_XGAMES_SURFING = "/sports/action-sports/surfing";
   /**
    * API resource /sports/action-sports/rally.
    */
   public static final String RESOURCE_XGAMES_RALLY = "/sports/action-sports/rally";
   
   private static Properties props = null;
   private static String apiKey = null;
   private static String apiBaseUrl = null;
   private String apiResource = null;
   private String apiMethod = null;
   private Map<String, String> apiParams = null;
   private String apiUrl = null;
   protected boolean validResource = false;
   protected boolean validMethod = false;
   
   /**
    * Initialize a new API.
    */
   public API() {
      super();
   }
   
   /**
    * Initialize a new API for a specific resource.
    * @param resource The resource.
    * @throws InvalidResourceException Thrown if the resource is invalid.
    */
   public API(String resource) {
      super();
      
      if (isSupportedResource(API.class, resource)) {
         this.validResource = true;
      }
      
      this.apiResource = resource;
   }
   
   /**
    * Initialize a new API for a specific resource and method endpoint.
    * @param resource The resource.
    * @param method The method.
    * @throws InvalidResourceException Thrown if the resource is invalid.
    * @throws InvalidMethodException Thrown if the method endpoint is invalid.
    */
   public API(String resource, String method) {
      super();
      
      if (isSupportedResource(API.class, resource)) {
         this.validResource = true;
      }
      
      if (isSupportedMethod(API.class, method)) {
         this.validMethod = true;
      }
      
      this.apiResource = resource;
      this.apiMethod = method;
   }
   
   /**
    * Initialize a new API for a specific resource, method and parameters.
    * @param resource The resource.
    * @param method The method.
    * @param params The Map of parameters
    * @throws InvalidResourceException Thrown if the resource is invalid.
    * @throws InvalidMethodException Thrown if the method is invalid.
    */
   public API(String resource, String method, Map<String, String> params) throws InvalidResourceException, InvalidMethodException {
      super();
      
      if (isSupportedResource(API.class, resource)) {
         this.validResource = true;
      }
      
      if (isSupportedMethod(API.class, method)) {
         this.validMethod = true;
      }
      
      this.apiResource = resource;
      this.apiMethod = method;
      this.apiParams = params;
   }
   
   /**
    * Runs init code to read the properties files.
    */
   private static void init() {
      try {
         props = new Properties();
         File jarFile = new File(API.class.getProtectionDomain().getCodeSource().getLocation().getPath());
         String propFilePath = jarFile.getParent();
         FileInputStream fis = new FileInputStream(propFilePath.concat("\\com.espn.api.properties"));
         // fis = new FileInputStream(propFilePath.concat("\\src\\main\\resources\\com.espn.api.properties"));
         props.load(fis);
         
         apiKey = props.getProperty("api.key");
         apiBaseUrl = props.getProperty("api.base.url");
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      } 
      catch (InvalidPropertiesFormatException e) {
         e.printStackTrace();
      } 
      catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   /**
    * Builds the API URL used for making a request.
    */
   private void buildUrl() {
      if (props == null) {
         init();
      }
      StringBuilder urlBuilder = new StringBuilder();
      urlBuilder.append(apiBaseUrl).append(apiResource);
      if (apiMethod != null && !apiMethod.isEmpty()) {
         urlBuilder.append(apiMethod);
      }
      urlBuilder.append("?apikey=").append(apiKey);
      
      if (this.apiParams != null && this.apiParams.size() > 0) {
         for (Map.Entry<String, String> parameter : this.apiParams.entrySet()) {
            urlBuilder.append("&").append(parameter.getKey()).append("=").append(parameter.getValue());
         }
      }
      
      this.apiUrl = urlBuilder.toString();
   }
   
   /**
    * Method for making a request to the ESPN API and returns the JSON response.
    * @return JSON String.
    */
   protected String getJsonResponse() {
      if (this.apiUrl == null) {
         this.buildUrl();
      }
      
      StringBuilder response = new StringBuilder();
      
      try {
         final URL url = new URL(this.apiUrl);
         final URLConnection connection = url.openConnection();

         connection.setDoOutput(true);
         connection.setRequestProperty("Accept-Encoding", "gzip");

         final OutputStream outputStream = connection.getOutputStream();
         final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
         
         String data = "";
         outputStreamWriter.write(data);
         outputStreamWriter.flush();

         final InputStream replyStream = connection.getInputStream();
         final InputStreamReader inputStreamReader;

         // The following is to check if the server sending the response supports
         // Gzip
         final String contentEncodingField = connection.getHeaderField("Content-Encoding");
         if (contentEncodingField != null && contentEncodingField.equalsIgnoreCase("gzip")) {
            // read the gzipped format
            final GZIPInputStream gzipInputStream = new GZIPInputStream(replyStream);
            inputStreamReader = new InputStreamReader(gzipInputStream);
         } else {
            inputStreamReader = new InputStreamReader(replyStream);
         }

         
         final BufferedReader reader = new BufferedReader(inputStreamReader);
         String line = null;
         while ((line = reader.readLine()) != null) {
            response.append(line);
         }
         outputStreamWriter.close();
         reader.close();
      }
      catch (IOException e) {
         e.printStackTrace();
      }

      return response.toString();
   }
   
   /**
    * Method for validating a resource.
    * @param clazz The class containing the set of resources. 
    * @param resource The resource to validate.
    * @return True/False
    */
   protected static boolean isSupportedResource(Class<?> clazz, String resource) {
      boolean isSupported = false;
      Field[] fields = clazz.getDeclaredFields();
      for (Field field : fields) {
         try {
            if (field.getName().startsWith("RESOURCE")) {
               String value = (String)field.get(null);
               if (value.equalsIgnoreCase(resource)) {
                  isSupported = true;
                  break;
               }
            }
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      }
      return isSupported;
   }
   
   /**
    * Method for validating a method endpoint.
    * @param clazz The class containing the set of methods.
    * @param method The method to validate.
    * @return True/False
    */
   protected static boolean isSupportedMethod(Class<?> clazz, String method) {
      boolean isSupported = false;
      Field[] fields = clazz.getDeclaredFields();
      for (Field field : fields) {
         try {
            if (field.getName().startsWith("METHOD")) {
               String value = (String)field.get(null);
               if (value.equalsIgnoreCase(method)) {
                  isSupported = true;
                  break;
               }
            }
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      }
      return isSupported;
   }
   
   /**
    * Resets the API method endpoint to the specified parameter.
    * @param method The method endpoint to use.
    */
   protected void reconfigureMethod(String method) {
      this.apiMethod = method;
   }
   
   /**
    * Method for retrieving the API data in Java representation.
    * @return The object define by T where T is parameter given.
    */
   public abstract T getAPIData();
}
