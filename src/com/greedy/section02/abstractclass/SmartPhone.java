package com.greedy.section02.abstractclass;

/* extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못한다. */
public class SmartPhone extends Product /* , java.util.Scanner */ {

	public SmartPhone() {
		super();
		System.out.println("SmartPhone 클래스의 기본생성자 호출됨...");
		
	}
}
