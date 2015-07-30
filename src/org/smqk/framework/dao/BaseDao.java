package org.smqk.framework.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public abstract class BaseDao  extends SqlSessionDaoSupport {
	
	/**
	 * 分页查询
	 * @param name 	
	 * @param param  参数
	 * @param pageNum 分页数
	 * @param pageSize	每页显示条数
	 * @return List
	 */
	protected  List<?> selectList(String name,Object param,int pageNum,int pageSize){
		return this.getSqlSession().selectList(name, param, new RowBounds(pageNum,pageSize));
	}
	
	/**
	 * (无参数的)分页查询
	 * @param name 	
	 * @param pageNum 分页数
	 * @param pageSize	每页显示条数
	 * @return List
	 */
	protected  List<?> selectList(String name,int pageNum,int pageSize){
		return this.selectList(name,null,pageNum,pageSize);
	}
	
	
	
	/**
	 * 查询单条数据
	 * @param name
	 * @param param 参数
	 * @return
	 */
	protected Object selectOne(String name,Object param) {
		return this.selectOne(name, param);
	}

}
