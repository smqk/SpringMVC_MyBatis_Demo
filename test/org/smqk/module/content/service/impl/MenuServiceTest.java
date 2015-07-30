package org.smqk.module.content.service.impl;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.smqk.module.content.domain.Menu;
import org.smqk.module.content.service.IMenuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MenuServiceTest {
	
	private static ApplicationContext ac;
	private static IMenuService menuService;
	
	@BeforeClass
	public static void init(){
		ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		menuService=(IMenuService) ac.getBean("menuService");
	}
	
	@Test
	public void menuTest(){
		List<Menu> mens=menuService.findMenu();
		for (Menu menu : mens) {
			System.out.println(menu.toString());
			List<Menu> subMenus=menu.getSubMenu();
			if(subMenus!=null && subMenus.size()>0){
				for (Menu subMenu : subMenus) {
					System.out.println("\t"+subMenu.toString());
				}
			}
		}
	}
}
