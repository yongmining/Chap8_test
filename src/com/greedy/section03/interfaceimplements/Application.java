package com.greedy.section03.interfaceimplements;

public class Application {

	public static void main(String[] args) {
		
		/* 인터페이스 (interface) 
		 * 자바 클래스와 유사한 형태이지만 추상메소드와 상수 필드만을 가질 수 있는 클래스의 변형체이다.
		 * */
		
	InterProduct.staticMethod();
	
	InterProduct product = new Product();
	product.nonStaticMethod();
	product.absmethod();
	product.defaultMethod();
	
	}
}
