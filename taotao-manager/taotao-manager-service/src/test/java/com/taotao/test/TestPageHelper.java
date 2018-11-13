package com.taotao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPageHelper {
	
	@Test
	public void pageHelper(){
		
		//加载spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		//获得代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		//设置分页
		PageHelper.startPage(1, 3);
		//设置分页条件	
		TbItemExample example = new TbItemExample();
		//查询数据
		List<TbItem> list = mapper.selectByExample(example );
		//获取信息
		System.out.println(list.size());
		
	}

}
