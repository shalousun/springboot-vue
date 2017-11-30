package com.boco.demo.dao;

import java.util.List;
import java.util.Map;

import com.boco.demo.model.SysUser;

/**
 * Created by ApplicationPower.
 * @author yu on 2017-11-22 19:47:23.
 */
public interface SysUserDao {

	/**
	 * 保存数据
	 * @param entity
	 * @return
     */
	int save(SysUser entity);

    /**
     * 批量添加数据
     * @param entityList
     * @return
     */
	int batchSave(List<SysUser> entityList);

	/**
	 * 更新数据
	 * @param entity
	 * @return
     */
	int update(SysUser entity);

	/**
	 * 删除数据
	 * @param id
	 * @return
     */
	int delete(int id);

	/**
	 * 根据id查询数据
	 * @param id
	 * @return
     */
	SysUser queryById(int id);

	/**
	 * 分页查询数据
	 * @return
     */
	List<SysUser> queryPage();

    /**
     * query result to list of map
     * @param params Map查询参数
     * @return
     */
    List<Map<String,Object>> queryToListMap(Map<String,Object> params);
}