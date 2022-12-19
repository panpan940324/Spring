package com.panpan.spring.test;

import com.panpan.spring.config.PanPanConConfig;
import com.panpan.spring.repository.Hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className: HelloTest
 * @Decsription: 向IDEA中导入Spring源码是否成功的测试类
 * @Author: 盼盼学Java
 * @Date: 2022/12/4 21:27
 * @version: 1.0
 */
public class HelloTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(PanPanConConfig.class);
		Hello hello = applicationContext.getBean(Hello.class);
		hello.hello();
	}
}
