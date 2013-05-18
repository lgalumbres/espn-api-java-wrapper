package com.espn.api.statistics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * StatCategory class represents the statCategory object in the ESPN APIs.
 */
public class StatCategory {

   private String name = null;
   private String description = null;
   private List<Stat> stats = null;
   
   public StatCategory() {
      super();
   }

   /**
    * Gets the name property.
    * @return The name property.
    */
   public String getName() {
      return name;
   }

   /**
    * Gets the description property.
    * @return The description property.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Gets the stats property.
    * @return The stats property.
    */
   public List<Stat> getStats() {
      return stats;
   }
   
   /**
    * Gets the number of stats.
    * @return The number of stats.
    */
   public Integer length() {
      Integer l = 0;
      if (stats != null) {
         l = stats.size();
      }
      return l;
   }
   
   /**
    * Gets the map of stats.
    *    Map<stat-name, stat-object>
    * @return The map of stats.
    */
   public Map<String, Stat> getStatsMap() {
      Map<String, Stat> s = new LinkedHashMap<String, Stat>();
      if (stats != null) {
         for (Stat stat : stats) {
            s.put(stat.getName(), stat);
         }
      }
      return s;
   }
}
