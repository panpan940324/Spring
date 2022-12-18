package com.panpan.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: MyClassPathXmlApplicationContext
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/12/18 22:04
 * @version: 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("拓展initPropertySource");
		getEnvironment().setRequiredProperties("username");
		setAllowBeanDefinitionOverriding(false);
	}
}
