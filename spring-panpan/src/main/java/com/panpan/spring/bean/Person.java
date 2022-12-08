package com.panpan.spring.bean;

/**
 * @className: Person
 * @Decsription: peson类型
 * @Author: 盼盼学Java
 * @Date: 2022/12/8 23:07
 * @version: 1.0
 */
public class Person {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
