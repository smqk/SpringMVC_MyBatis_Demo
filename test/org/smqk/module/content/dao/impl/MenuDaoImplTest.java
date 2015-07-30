package org.smqk.module.content.dao.impl;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.smqk.module.content.dao.IMenuDao;
import org.smqk.module.content.domain.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MenuDaoImplTest {
	private static ApplicationContext ac;
	private static IMenuDao menuDao;
	
	@BeforeClass
	public static void init(){
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		menuDao=(IMenuDao) ac.getBean("menuDao");
	}
	
	@Test
	public void findMenusByParentIdTest(){
		List<Menu> menus=menuDao.findMenusByParentId(null);
		for (Menu menu : menus) {
			System.out.println(menu.toString());
		}
	}

}
