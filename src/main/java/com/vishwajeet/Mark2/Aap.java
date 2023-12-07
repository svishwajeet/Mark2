package com.vishwajeet.Mark2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aap{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Product product = context.getBean(Product.class);
		System.out.println(product);
	}
}