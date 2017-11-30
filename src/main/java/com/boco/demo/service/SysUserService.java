package com.boco.demo.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.boco.common.model.CommonResult;
import com.boco.demo.model.SysUser;

/**
 *
 * Created by ApplicationPower.
 * @author yu on 2017-11-22 19:47:23.
 */
public interface SysUserService {

	/**
	 * 保存数据
	 * @param entity
	 * @return
     */
	CommonResult save(SysUser entity);

	/**
	 * 修改数据
	 * @param entity
	 * @return
     */
	CommonResult update(SysUser entity);

	/**
	 * 删除数据
	 * @param id
	 * @return
     */
	CommonResult delete(int id);

	/**
	 * 根据id查询数据
	 * @param id
	 * @return
     */
	CommonResult queryById(int id);

	/**
     * 分页查询
     * @param offset 偏移量
     * @param limit 每页大小
     * @return
     */
    PageInfo queryPage(int offset, int limit);

    /**
     * query result to list of map
     * @param params Map查询参数
     * @return
     */
    List<Map<String,Object>> queryToListMap(Map<String,Object> params);
}