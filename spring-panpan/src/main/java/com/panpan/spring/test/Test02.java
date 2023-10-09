package com.panpan.spring.test;

import com.panpan.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: Test02
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2023/10/7 22:31
 * @version: 1.0
 */
public class Test02 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext_${username}.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
