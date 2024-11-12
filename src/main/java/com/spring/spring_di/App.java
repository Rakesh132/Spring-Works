package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");

		JavaTrainer jt = (JavaTrainer) cpx.getBean("javaT");
		SQLTrainer st = (SQLTrainer) cpx.getBean("sqlT");
		WebTrainer wt = (WebTrainer) cpx.getBean("webT");

		System.out.println(jt.getName());
		System.out.println(st.getName());
		System.out.println(wt.getName());

	}
}
