package com.te.autowiring;

public class Laptop {
	Screen s;
	Battery b;
	Hardisk h1;
	Hardisk h2;
//	public Laptop(Screen s, Battery b, Hardisk h1, Hardisk h2) {
//		super();
//		this.s = s;
//		this.b = b;
//		this.h1 = h1;
//		this.h2 = h2;
//	}
	public void setS(Screen s) {
		this.s = s;
	}
	public void setB(Battery b) {//this set methods is for wireby type and name
		this.b = b;
	}
	public void setH1(Hardisk h1) {
		this.h1 = h1;
	}
	public void setH2(Hardisk h2) {
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Laptop [s=" + s + ", b=" + b + ", h1=" + h1 + ", h2=" + h2 + "]";
	}
//	
//	@Override
//	public String toString() {
//		return "Laptop [s=" + s + ", b=" + b + ", h1=" + h1 + "]";
//	}
//	

	

}
