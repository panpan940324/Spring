package com.panpan.spring.test;

import com.panpan.spring.bean.MyClassPathXmlApplicationContext;
import com.panpan.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: Test01
 * @Decsription: 测试类01
 * @Author: 盼盼学Java
 * @Date: 2022/12/8 23:19
 * @version: 1.0
 */
public class Test01 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext01.xml");
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_${username}.xml");
		// MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("applicationContext_${username}.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}
