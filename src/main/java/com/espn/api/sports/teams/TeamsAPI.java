package com.espn.api.sports.teams;

import java.util.Map;

import com.espn.api.API;
import com.espn.api.InvalidMethodException;
import com.espn.api.InvalidResourceException;

public class TeamsAPI extends API {

   public TeamsAPI() {
      // TODO Auto-generated constructor stub
   }

   public TeamsAPI(String resource) {
      super(resource);
      // TODO Auto-generated constructor stub
   }

   public TeamsAPI(String resource, String method) {
      super(resource, method);
      // TODO Auto-generated constructor stub
   }

   public TeamsAPI(String resource, String method, Map params)
         throws InvalidResourceException, InvalidMethodException {
      super(resource, method, params);
      // TODO Auto-generated constructor stub
   }

   @Override
   public Object getAPIData() {
      // TODO Auto-generated method stub
      return null;
   }

}
