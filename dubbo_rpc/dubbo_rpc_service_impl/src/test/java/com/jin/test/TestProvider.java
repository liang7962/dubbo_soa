package com.jin.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {
	
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:com/jin/config/spring/applicationContext-dubbo.xml");
		
		System.out.println("provide starting....");
		
		//����������������
		//�����ǿ����µ��سǣ�������߳�û�ж�������֧�߳�Ĭ�ϻ�������߳�ͬʱ�ر�
		context.start();
		
		System.out.println("provide started");
		
		//�����߳�
		System.in.read();
		
		
	}
}
