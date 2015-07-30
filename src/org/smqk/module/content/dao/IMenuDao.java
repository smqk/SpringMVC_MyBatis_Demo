package org.smqk.module.content.dao;

import java.util.List;

import org.smqk.module.content.domain.Menu;

public interface IMenuDao {
	
	/**
	 * 查询导航菜单，通过菜单项的父菜单ID来查询菜单
	 * @param parentId 父菜单ID
	 * @return List<菜单>
	 */
	public List<Menu> findMenusByParentId(String parentId);
}
