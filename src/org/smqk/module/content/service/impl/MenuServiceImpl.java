package org.smqk.module.content.service.impl;

import java.util.List;

import org.smqk.module.content.dao.IMenuDao;
import org.smqk.module.content.domain.Menu;
import org.smqk.module.content.service.IMenuService;

public class MenuServiceImpl implements IMenuService {
	private IMenuDao menuDao;
	
	public IMenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
	}


	/**
	 * 查询导航栏菜单
	 * @return List<导航栏菜单> 
	 */
	@Override
	public List<Menu> findMenu() {
		//一级菜单
		List<Menu> menus= menuDao.findMenusByParentId(null);
		
		//设置二级菜单
		for (Menu menu : menus) {
			List<Menu> subMenu=menuDao.findMenusByParentId(menu.getId());
			menu.setSubMenu(subMenu);
		}
		
		return menus;
	}

}
