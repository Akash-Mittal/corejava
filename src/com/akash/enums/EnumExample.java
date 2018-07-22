package com.akash.enums;

import java.util.EnumMap;


public enum EnumExample {
	Utah(1),SanHose(2),Bermingam(3),sanfransiscobay(4);
	private int index;
	private EnumExample(int index) {
	this.index=index;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
public static void main(String[] args) {
	EnumMap<EnumExample, Integer> enumMap =
			new EnumMap<EnumExample, Integer>(EnumExample.class);
	
}
}