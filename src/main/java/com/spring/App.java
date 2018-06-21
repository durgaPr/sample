package com.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App{

	public static void main(String[] args) {
		BeanFactory  factory=new XmlBeanFactory(new FileSystemResource("src/test/resources/com/spring/applicationcontest.xml"));
		Spring s=(Spring) factory.getBean("wish",Spring.class);
		s.setMessage("Hi How are you ?");
		String msg=s.getMessage();
		System.out.println(msg);
		Spring s2=(Spring) factory.getBean("wish",Spring.class);
		s2.setMessage("Iam fine, thank you! How about you ?");
		String msg2=s2.getMessage();
		System.out.println(msg2);
	}

}