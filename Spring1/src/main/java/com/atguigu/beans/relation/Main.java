package com.atguigu.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.autowire.Address;
import com.atguigu.spring.beans.autowire.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bean-relation.xml");
		
//		Address address= (Address) ctx.getBean("address");
//		System.out.println(address);
		
		Address address2= (Address) ctx.getBean("address2");
		System.out.println(address2);
		
		Address address3= (Address) ctx.getBean("address3");
		System.out.println(address3);
		
		Person person=(Person) ctx.getBean("person");
		
		System.out.println(person);
		
		
		
		
	}

}
