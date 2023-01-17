package com.greedy.section01.polymorphism;

public class Application1 {

	public static void main(String[] args) {
		/* 다형성 */
		
		System.out.println("Animal 생성 -----------");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		System.out.println("Rabbit 생성 -----------");
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		System.out.println("Tiger 생성 ------------");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		
		/* Rabbit과 Tiger는 Animal 클래스를 상속받았다.
		 * 따라서 Rabbit는 Rabbit 타입이기도 하면서 Animal 타입이기도 하며
		 * Tiger는 Tiger 타입이면서 Animal 타입이기도 하다.
		 * */
		
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
		/* Animal은 Animal 이지 Tiger나 Rabbit이 아니다. */
//		Rabbit r = new Animal();
//		Tiger t = new Animal();
		
		System.out.println("동적바인딩 -------------");
		a1.cry();
		a2.cry();
		
//		a1.jump();
//		a2.bite();
		
		System.out.println("클래스타입 형변환 --------");
		((Rabbit) a1).jump();
		((Tiger) a2).bite();
		
		/* 타입 형변환을 잘못 하는 경우 컴파일 시에는 문제되지 않지만 런타임 시 ClassCastException 발생함 */
//		((Tiger)a1).bite();
		
		System.out.println("instanceof 확인 ------");
		System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
		System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
		System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
		System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));


		if(a1 instanceof Rabbit) {
			((Rabbit) a1).jump();
		}
		
		if(a1 instanceof Tiger) {
			((Tiger) a1).bite();
		}
		
		/* 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 * up-casting : 상위 타입 형변환 (묵시정 형변환)
		 * down-casting : 하위 타입으로 형변환 (명시적 형변환)
		 * */
		Animal animal1 = (Animal)new Rabbit();
		Animal animal2 = new Rabbit();
		
		Rabbit rabbit1 = (Rabbit) animal1;
//		Rabbit rabbit2 = animal2;
	}
}
