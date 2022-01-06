package com.te.autowiring;

public class Hardisk {
String name;


//public Hardisk(String name) {
//	super();
//	this.name = name;
//}
//

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Hardisk [name=" + name + "]";
}

}
