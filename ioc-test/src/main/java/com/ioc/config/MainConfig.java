package com.ioc.config;

import com.ioc.entity.User;
import org.springframework.context.annotation.*;

/**
 * @author zhaixinwei
 * @date 2022/7/27
 * @description
 */
@Lazy
@Configuration
@ComponentScan(basePackages = "com.ioc")
public class MainConfig {


	@Bean
	public User user(){
		User user = new User();
		user.setAge(23);
		user.setName("zxw");
		return user;
	}

}
