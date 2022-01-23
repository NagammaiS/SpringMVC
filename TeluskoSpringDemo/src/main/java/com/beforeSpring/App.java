package com.beforeSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//before interface 
		Car car = new Car();  car.drive();
		Bike bike = new Bike();  bike.drive();
		
//after interface one  side dependency has been reduced 
		Vehicle v = new Car();
		v.drive();
		
//now both side dependency has reduced we are asing whatever vehicle you have give it to me 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle vehicle = (Vehicle)ctx.getBean("vehicle");
		v.drive();
		
		

		
		
		
	}

}
