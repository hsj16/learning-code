package com.hsj.demo.springbeans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hsj.demo.springbeans.bean.User;

public class Main {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/test-bean.xml"));

		User user = beanFactory.getBean(User.class);
		System.err.println(user.getName());

	}

}
