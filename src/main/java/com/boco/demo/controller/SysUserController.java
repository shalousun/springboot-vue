package com.boco.demo.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pagehelper.PageInfo;
import com.boco.common.model.CommonResult;
import com.boco.demo.model.SysUser;
import com.boco.demo.service.SysUserService;

/**
 * Created by ApplicationPower.
 * @author yu on 2017-11-22 19:47:23.
 */
@Controller
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(SysUserController.class);

	@Resource
	private SysUserService sysUserService;

	@ResponseBody
	@PostMapping(value = "/add")
	public CommonResult save(SysUser entity) {
		return sysUserService.save(entity);
	}

	@ResponseBody
	@PostMapping(value = "/update")
	public CommonResult update(SysUser entity) {
		return sysUserService.update(entity);
	}

	@ResponseBody
	@GetMapping(value = "/delete/{id}")
	public CommonResult delete(@PathVariable int id) {
		return sysUserService.delete(id);
	}

	@ResponseBody
	@GetMapping(value = "/query/{id}")
	public CommonResult queryById(@PathVariable int id) {
		return sysUserService.queryById(id);
	}

    @ResponseBody
    @GetMapping(value = "/page/{offset}/{limit}")
    public PageInfo queryPage(@PathVariable int offset,@PathVariable int limit) {
        return sysUserService.queryPage(offset,limit);
    }

    @ResponseBody
    @GetMapping(value = "/listMap")
    public List<Map<String,Object>> queryToListMap(@RequestParam Map<String,Object> params) {
        return sysUserService.queryToListMap(params);
    }
}