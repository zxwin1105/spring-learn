package com.ioc.config;

import com.ioc.entity.TankBean;
import com.ioc.entity.User;
import com.ioc.postprocess.MyBeanFactoryPostProcess;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.*;

/**
 * @author zhaixinwei
 * @date 2022/7/27
 * @description
 */
@Lazy
@Configuration
//@ComponentScan(basePackages = "com.ioc")
public class MainConfig {

	@Bean
	public User user(){
		User user = new User();
		user.setAge(23);
		user.setName("zxw");
		return user;
	}

	@Bean
	public TankBean tankBean(){
		return new TankBean("origin");
	}

	@Bean
	public BeanFactoryPostProcessor myBeanFactoryPostProcess(){
		return new MyBeanFactoryPostProcess();
	}
}
