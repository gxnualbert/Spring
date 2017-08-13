package com.atguigu.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.atguigu.spring.beans.autowire.Address;
import com.atguigu.spring.beans.autowire.Car;
import com.atguigu.spring.beans.autowire.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		
		System.out.println(car==car2);
		
		
		
	}

}
