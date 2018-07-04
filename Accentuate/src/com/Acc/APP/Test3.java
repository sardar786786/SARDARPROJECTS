package com.Acc.APP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("naresh.xml");
      Patient p1=(Patient)context.getBean("pet");
      p1.display();
	}

}
