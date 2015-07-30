package org.smqk.framework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	private static ApplicationContext ac;
	
	public BaseTest(){
		init();
	}
	
	public static ApplicationContext getAc() {
		return ac;
	}

	public static void setAc(ApplicationContext ac) {
		BaseTest.ac = ac;
	}


	public static void init(){
		ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
	}
}
