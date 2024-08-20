package com.springapp.springapp;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringappApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
			Dev obj = context.getBean(Dev.class);
			obj.build();
			System.out.println(obj.getAge());
			System.out.println(obj.getLap());
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
