package com.ioc;

import com.ioc.config.MainConfig;
import com.ioc.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaixinwei
 * @date 2022/7/27
 * @description
 */
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		User user = context.getBean("user", User.class);

		System.out.println(user);

	}
}
