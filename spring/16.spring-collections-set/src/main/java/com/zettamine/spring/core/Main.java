package com.zettamine.spring.core;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zettamine.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital hosp = (Hospital)context.getBean("apollo");
		
		System.out.println("Hospital Name = " + hosp.getHospitalName());
		
		System.out.println("------------ DEPARTMENTS ----------------");
		Set<String> departments = hosp.getDeptNames();
		
		departments.stream().forEach(dept -> System.out.println("----> " + dept));
	}

}
