package org.smqk.module.content.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smqk.framework.dao.BaseDao;
import org.smqk.module.content.dao.IMenuDao;
import org.smqk.module.content.domain.Menu;

public class MenuDaoImpl extends BaseDao implements IMenuDao{
	private final String NS="org.smqk.module.content.dao.IMenuDao.";
	
	/**
	 * 查询导航菜单，通过菜单项的父菜单ID来查询菜单
	 * @param parentId 父菜单ID
	 * @return List<菜单>
	 */
	@Override
	public List<Menu> findMenusByParentId(String parentId) {
		Map<String, String> args=new HashMap<String,String>();
		args.put("parentId", parentId);
		return getSqlSession().selectList(NS+"findMenusByParentId",args);
	}

}
