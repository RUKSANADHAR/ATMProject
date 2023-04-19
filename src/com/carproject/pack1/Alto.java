package com.carproject.pack1;

public class Alto extends Car {
   @Override
   public void start() {
	   System.out.println("key start");
   }
   @Override
   public void accelerater() {
	   System.out.println("half clutch");
   }
   @Override
   public void stop() {
	   System.out.println("key stop");
   }
   public void bluetooth() {
	   System.out.println("boat is avaible for alto car");
   }
}
