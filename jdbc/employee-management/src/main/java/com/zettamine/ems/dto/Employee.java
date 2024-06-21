package com.zettamine.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	//@NonNull
	private Integer employeeNo;
	private String employeeName;
	private Float employeeSal;
}
