package com.carproject.pack1;

public class carDrivingclass {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Driver driver=new Driver();
driver.drive(new Alto());
System.out.println("&&&&&&&&&&&&&&");
driver.drive(new Audi());
System.out.println("*************");
driver.drive(new Benz());
System.out.println("VVVVVVVVVVVVVVVVVVVVVV");
driver.accessbluetooth(new Alto());
driver.accessbluetooth(new Audi());
	}

}
