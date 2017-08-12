package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//类可以访问其所在包中的所有类 《java教程 69页》
		/*
		//创建HelloWord的一个对象
		HelloWorld helloWorld=new HelloWorld();
		//为name属性赋值
		helloWorld.setName("atguigu");
		*/
		
		//如果使用spring的话，那么创建对象，给属性赋值，这两个过程都可以由spring来完成
		
		
//		1.创建spring的IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		2.从IOC容器中获取Bean实例
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloworld");
		
		//调用hello方法gg
		helloWorld.hello();
		
	}

}
