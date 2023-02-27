package com.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Employee;

public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee searchEmployeeByNo(Set set, int empNo) {

		Employee temp = null;
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				if (new_name.getEmpNo() == empNo) {
					temp = new_name;
				}

			}

		}
		return temp;

	}
 
	@Override
	public Set searchEmployeeByName(Set set, String empName) {
		Set set2 = new HashSet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				if (new_name.getEmpName().equals(empName)) {
					set2.add(new_name);
				}

			}

		}
		return set2;
	}

	@Override
	public Set searchEmployeeByAge(Set set, int age) {
		Set set2 = new HashSet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				if (new_name.getAge() == age) {
					set2.add(new_name);
				}

			}

		}
		return set2;
	}

	@Override
	public Set searchEmployeeByGender(Set set, char gender) {
		Set set2 = new HashSet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				if (new_name.getGender() == gender) {
					set2.add(new_name);
				}

			}

		}
		return set2;
	}

}
