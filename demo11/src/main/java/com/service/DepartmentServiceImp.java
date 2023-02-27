package com.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Department;
import com.model.Employee;

public class DepartmentServiceImp implements DepartmentService {

	@Override
	public Department searchDepartmentByNo(Set set, int deptNo) {
		Department temp = null;
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Department) {
				Department new_name = (Department) object;
				if (new_name.getDepNo() == deptNo) {
					temp = new_name;
				}

			}

		}
		return temp;
	}

	@Override
	public Set searchDepartmentByName(Set set, String deptName) {
		Set set2 = new HashSet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Department) {
				Department new_name = (Department) object;
				if (new_name.getDepName().equals(deptName)) {
					set2.add(new_name);
				}

			}

		}
		return set2;
	}

}
