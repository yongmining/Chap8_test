package com.greedy.section01.polymorphism;

public class Application3 {

	public static void main(String[] args) {
		
		/* 매개변수와 다형성 */
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
	
		Application3 app3 = new Application3();
		app3.feed(animal1);
		app3.feed(animal2);
		
		Rabbit animal3 = new Rabbit();
		Tiger animal4 = new Tiger();
		
		app3.feed((Animal) animal3);
		app3.feed((Animal) animal4);
		
		
		app3.feed(animal3);
		app3.feed(animal4);
		
		app3.feed(new Rabbit());
		app3.feed(new Tiger());
		
		
		
	}
	
	public void feed(Animal animal) {
		animal.eat();
	}
	
//	public void feed(Rabbit animal) {
//		animal.eat();
//	}
//	
//	public void feed(Tiger animal) {
//		animal.eat();
//	}
}
