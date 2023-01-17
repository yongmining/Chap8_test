package com.greedy.section02.abstractclass;

/* extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못한다. */
public class SmartPhone extends Product /* , java.util.Scanner */ {

	public SmartPhone() {
		super();
		System.out.println("SmartPhone 클래스의 기본생성자 호출됨...");
		
	}
	@Override
	public void abstMethod() {
		System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출함...");
	}
	
	public void printSmartPhone() {
		System.out.println("SmartPhone 클래스의 printSamrtphonh 메소드 호출함...");
	}
}
