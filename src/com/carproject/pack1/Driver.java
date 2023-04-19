package com.carproject.pack1;

public class Driver {
	public void drive(Car car) {
		car.start();
		car.accelerater();
		car.stop();
	}
	public void accessbluetooth(Car car) {
		if(car instanceof Alto)
			((Alto)car).bluetooth();
		if(car instanceof Audi)
			((Audi)car).bluetooth();
	}

}
