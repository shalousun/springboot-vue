package com.boco.demo.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.boco.common.model.CommonResult;
import com.boco.demo.model.SysUser;
import com.boco.demo.dao.SysUserDao;
import com.boco.demo.service.SysUserService;

/**
 * Created by ApplicationPower.
 * @author yu on 2017-11-22 19:47:23.
 */
@Service("sysUserService")
public class SysUserServiceImpl  implements SysUserService{

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(SysUserService.class);

	@Resource
	private SysUserDao sysUserDao;

	@Override
	public CommonResult save(SysUser entity) {
		CommonResult result = new CommonResult();
        try {
        	sysUserDao.save(entity);
        	result.setSuccess(true);
        } catch (Exception e) {
        	result.setMessage("添加数据失败");
        	logger.error("SysUserService添加数据异常：",e);
        }
        return result;
	}

	@Override
	public CommonResult update(SysUser entity) {
		CommonResult result = new CommonResult();
        try {
            sysUserDao.update(entity);
            result.setSuccess(true);
        } catch (Exception e) {
            result.setMessage("修改数据失败");
            logger.error("SysUserService修改数据异常：",e);
        }
        return result;
	}

	@Override
	public CommonResult delete(int id) {
		CommonResult result = new CommonResult();
        try {
            sysUserDao.delete(id);
            result.setSuccess(true);
        } catch (Exception e) {
            result.setMessage("删除数据失败");
            logger.error("SysUserService删除数据异常：",e);
        }
        return result;
	}

	@Override
	public CommonResult queryById(int id) {
	    CommonResult result = new CommonResult();
	    SysUser entity = sysUserDao.queryById(id);
	    if (null != entity) {
        	result.setData(entity);//成功返回数据
        	result.setSuccess(true);
        } else {
        	result.setMessage("没有找到匹配数据");
        	logger.info("SysUserService未查询到数据，编号：{}",id);
        }
        return result;
	}

	@Override
    public PageInfo queryPage(int offset, int limit) {
        PageHelper.offsetPage(offset,limit);
        List<SysUser> list = sysUserDao.queryPage();
        return new PageInfo(list);
    }

    @Override
    public List<Map<String,Object>> queryToListMap(Map<String,Object> params){
        return sysUserDao.queryToListMap(params);
    }
}