package com.te.springannotationsmixed;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	@Autowired
Employee employee;

@Override
public String toString() {
	return "Company [employee=" + employee + "]";
}

}
