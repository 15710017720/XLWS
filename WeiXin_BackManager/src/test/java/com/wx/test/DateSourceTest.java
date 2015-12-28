/**
 * 
 */
package com.wx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author Administrator
 *
 */
public class DateSourceTest {
	

	private ApplicationContext ac = null;
	
	@Before
	public void befer(){
		ac = new ClassPathXmlApplicationContext("root-context.xml");
	}

	/**
	 * 
	 * 作者 wl
	 * 2015年12月28日
	 * 说明:测试数据是否链接成功
	 */
	@Test
	public void test() {
		DruidDataSource dds = (DruidDataSource) ac.getBean("dataSource");
		System.out.println(dds);
	}

}
