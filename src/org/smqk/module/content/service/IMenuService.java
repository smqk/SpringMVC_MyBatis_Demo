package org.smqk.module.content.service;

import java.util.List;

import org.smqk.module.content.domain.Menu;

public interface IMenuService {
	
	/**
	 * 查询导航栏菜单
	 * @return List<导航栏菜单> 
	 */
	public List<Menu> findMenu();

}
