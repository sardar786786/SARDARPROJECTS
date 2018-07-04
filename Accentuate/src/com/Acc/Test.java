package com.Acc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Resource rs=new ClassPathResource("ramu.xml");
    BeanFactory f1=new XmlBeanFactory(rs);
    //Student s1=f1.getBean(f1);
    Student s1=(Student)f1.getBean("std");
    s1.show();
    System.out.println("hii");
	}

}
