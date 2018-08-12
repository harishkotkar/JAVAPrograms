package com.harish;
enum TLight {
   // Each instance provides its implementation to abstract method
   RED(30) {
      public TLight next() {  
         return AMBER;
      }
   },
   AMBER(10) {
      public TLight next() {
         return GREEN;
      }
   },
   GREEN(30) {
      public TLight next() {
         return RED;
      }
   };
 
   public abstract TLight next(); // An abstract method
   
   private final int seconds;     // Private variable
 
   TLight(int seconds) {          // Constructor
      this.seconds = seconds;
   }
 
   int getSeconds() {             // Getter
      return seconds;
   }  
}
   
public class TLightTest 
{
   public static void main(String[] args) 
   {
      for (TLight light : TLight.values()) 
      {
         System.out.printf("%s: %d seconds, next is %s\n", light, light.getSeconds(), light.next());
      }
   }
}