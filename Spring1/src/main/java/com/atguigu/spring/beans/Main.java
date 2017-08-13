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
		helloWorld.hello();
		*/
		//如果使用spring的话，那么创建对象，给属性赋值，这两个过程都可以由spring来完成
//		1.创建spring的IOC容器
//		ApplicationContext 代表 IOC 容器
//		ClassPathXmlApplicationContext：是ApplicationContext 接口的实现类，该实现类从类路径下加载配置文件。
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		2.从IOC容器中获取Bean实例
//		利用id 定位到 IOC 容器中的bean（要求IOC 中必须只能有一个该类型的bean）
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloworld");
		//调用hello方法gg
		helloWorld.hello();
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
		
		Person person2=(Person) ctx.getBean("person2");
		System.out.println(person2);
		 
		
	}
}
