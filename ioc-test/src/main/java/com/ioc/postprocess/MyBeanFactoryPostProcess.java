package com.ioc.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhaixinwei
 * @date 2023/4/12
 */

//@Component
public class MyBeanFactoryPostProcess implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("开始修改Bean定义");
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		user.getPropertyValues().add("name", "tom");
		System.out.println("完成修改Bean定义");
	}
}
