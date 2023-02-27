package com.annotation;

import java.util.ArrayList;
import java.util.List;

public class SupresesWarningDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List list =new ArrayList();// type safty ==avoid class cast exception

	}

}
