package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.service.TestService;
/**
 * dubbo测试，表现层类
 * @author Administrator
 *
 */
@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	/**
	 * 测试dubbo
	 */
	
	@RequestMapping("/test/queryNow")
	@ResponseBody
	public String queryNow(){
		return testService.queryNow();
	}

}
