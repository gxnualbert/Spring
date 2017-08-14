package com.atguigu.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car=(Car) applicationContext.getBean("car1");
		System.out.println(car);
		
		Car car2=(Car) applicationContext.getBean("car2");
		System.out.println(car2);
		
		
		
	}

}
