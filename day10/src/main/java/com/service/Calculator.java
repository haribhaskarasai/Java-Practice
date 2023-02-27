package com.service;

import com.exception.PositiveNumException;

public class Calculator {
  public int add(int num1,int num2) throws PositiveNumException {
	  int temp=0;
	  if(num1>0 && num2>0) {
		  temp= num1+num2;
	  }
	  else {
		  //raise a exception
		  throw new PositiveNumException("Please Enter Positive ");
	  }
	 return temp;
  }
  public int div(int num1,int num2) {
	  return num1/num2;
  }
}
