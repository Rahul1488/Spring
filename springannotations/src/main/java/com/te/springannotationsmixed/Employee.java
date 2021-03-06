package com.te.springannotationsmixed;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("TestYantra")
String companyName;
	@Value("150")
int dev;
	@Value("10")
int test;
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public void setDev(int dev) {
	this.dev = dev;
}
public void setTest(int test) {
	this.test = test;
}
@Override
public String toString() {
	return "Employee [companyName=" + companyName + ", dev=" + dev + ", test=" + test + "]";
}

}
