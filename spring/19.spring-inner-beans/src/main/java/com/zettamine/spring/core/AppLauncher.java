package com.zettamine.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zettamine.spring.core.beans.Address;
import com.zettamine.spring.core.beans.Employee;

public class AppLauncher {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee-address-beans.xml");

		Employee emp = (Employee)context.getBean("emp");
		System.out.println(emp);
		
		Address empAddr = emp.getEmployeeAddress();
		System.out.println(empAddr);
		
		context.close();
	}

}
