package com.greedy.section01.polymorphism;

public class Tiger extends Animal{
	
	
	@Override
	public void eat() {
		System.out.println("호랑이가 고기를 뜯어먹습니다.");
	}
	
	@Override
	public void run() {
		System.out.println("호랑이는 왠만해서는 달리지 않습니다. 어슬렁~ 어슬렁 걸어갑니다.");
	}

	@Override
	public void cry() {
		System.out.println("호랑이가 울부짖습니다. 어흐으으으응!~~~");
	}
	
	public void bite() {
		System.out.println("호랑이가 물어뜯십니다. 앙~");
	}
}
