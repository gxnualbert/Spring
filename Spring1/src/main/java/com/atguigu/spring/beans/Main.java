package com.atguigu.spring.beans;

public class Main {

	public static void main(String[] args) {
//		类可以访问其所在包中的所有类 《java教程 69页》
//		创建HelloWord的一个对象
		HelloWorld helloWorld=new HelloWorld();
//		为name属性赋值
		helloWorld.setName("atguigu");
//		调用hello方法gg
		helloWorld.hello();
		
	}

}
