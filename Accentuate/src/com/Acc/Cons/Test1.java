package com.Acc.Cons;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Acc.Student;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource rs=new ClassPathResource("rishi.xml");
		    BeanFactory f1=new XmlBeanFactory(rs);
		    //Student s1=f1.getBean(f1);
		    //Student s1=(Student)f1.getBean("std");
		    Emp e1=(Emp)f1.getBean("emp");
		    e1.show();
	}

}
