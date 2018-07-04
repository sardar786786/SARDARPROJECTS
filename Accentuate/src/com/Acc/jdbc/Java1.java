package com.Acc.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("prasana.xml");
		naveenDao dao=(naveenDao)context.getBean("nave");
        int k=dao.savenaveen(new naveen(1,"java"));
        System.out.println(k);
        System.out.println("data is inserted");
        
        
	}

}
