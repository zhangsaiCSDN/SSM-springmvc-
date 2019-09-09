package com.woniuxy.test;


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniuxy.domain.Dept;
import com.woniuxy.service.IDeptService;

public class AppTest {

	
	@Test
	public void test() throws Exception {
		ApplicationContext ac = //
				new ClassPathXmlApplicationContext("applicationContext.xml");
		IDeptService ds =(IDeptService) ac.getBean("deptServiceImpl");
	 Dept d = new Dept();
	 d.setDname("������˾��ʮ�ĺ������ƺ��������ǻ�222");
	 ds.save(d);
		
	}
}
