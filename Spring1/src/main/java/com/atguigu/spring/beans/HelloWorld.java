package com.atguigu.spring.beans;
/**
 * HelloWorld 类中，有一个属性name，提供了一个setname 方法。
 * 然后再hello方法中打印课一条语句 hello 。。。。
 * */
public class HelloWorld {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void hello() {
		System.out.println("hello: "+name);
	}
}
