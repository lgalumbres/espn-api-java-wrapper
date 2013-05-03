package com.espn.api;

/**
 * An InvalidResourceException is thrown when an API resource is not supported.
 */
public class InvalidResourceException extends RuntimeException {
   
   public InvalidResourceException() {
      super();
   }
   
   public InvalidResourceException(String message) {
      super(message);
   }
   
   public InvalidResourceException(Throwable t) {
      super(t);
   }
   
   public InvalidResourceException(String message, Throwable t) {
      super(message, t);
   }
}
