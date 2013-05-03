package com.espn.api;

/**
 * A InvalidMethodException is thrown when an API method is not supported.
 */
public class InvalidMethodException extends RuntimeException {

   public InvalidMethodException() {
      super();
   }

   public InvalidMethodException(String message) {
      super(message);
   }

   public InvalidMethodException(Throwable t) {
      super(t);
   }

   public InvalidMethodException(String message, Throwable t) {
      super(message, t);
   }

}
