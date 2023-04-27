package com.ioc.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhaixinwei
 * @date 2023/4/27
 */

public class TankBean implements FactoryBean<TankBean> {

	private String name;

	@Override
	public TankBean getObject() throws Exception {
		return new TankBean("tank");
	}

	@Override
	public Class<?> getObjectType() {
		return TankBean.class;
	}

	public TankBean(String name) {
		this.name = name;
	}

	public TankBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TankBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
