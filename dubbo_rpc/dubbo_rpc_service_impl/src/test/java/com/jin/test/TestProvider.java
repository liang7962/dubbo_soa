package com.jin.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {
	
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:com/jin/config/spring/applicationContext-dubbo.xml");
		
		System.out.println("provide starting....");
		
		//启动容器发布服务
		//启动是开启新的县城，如果主线程没有堵塞，分支线程默认会跟随主线程同时关闭
		context.start();
		
		System.out.println("provide started");
		
		//阻塞线程
		System.in.read();
		
		
	}
}
