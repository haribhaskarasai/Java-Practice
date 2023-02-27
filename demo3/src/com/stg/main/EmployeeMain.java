package com.stg.main;

import com.stg.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		int[] myData = { 1, 2, 3, 4, 5 };
		EmployeeService employeeService = new EmployeeService();
		System.out.println(employeeService.function(552));
		System.out.println(employeeService.sumOfArray(myData));
		String[] strVar = { "abc", "hsdj", "sihjk" };
		String req = employeeService.strConcatenation(strVar);
		System.out.println(req);
		String[] ans = employeeService.returnArrayOfString();
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
