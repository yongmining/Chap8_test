package com.greedy.section03.interfaceimplements;

/* 인터페이스에서 인터페이스를 상속받을 시 extends를 사용하며 다중 상속이 가능하다. */
public interface InterProduct extends SmartPhone, java.io.Serializable {
	
	/* 인터페이스는 생성자를 가질 수 없다. */
//	public InterProduct() {}
	
	/* 인터페이스는 상수 필드만 사용 가능하다.
	 * public static final 제어자 조합을 상수필드라고 부른다.
	 * 반드시 선언과 동시에 초기화 해야 한다.
	 * */
	
	public static final int MAX_NUM = 100;
	
	/* 상수 필드만을 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final의 의미를 가진다. */
	int MIN_NUM = 10;
	
	/* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
//	public void nonStaticMethod() {}
	
	
	/* 하지만 static 메소드는 작성이 가능하다. (JDK 1.8 부터 추가된 기능) */
	public static void staticMethod() {
		System.out.println("InterProduct의 staticMethod 호출됨...");
	}
	
	/* 추상 메소드만 가질 수 있다. */
	public abstract void nonStaticMethod();
	
	/* 인터페이스 내부에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.
	 * 다른 접근제한자 사용이 불가능하다.
	 * 인터페이스의 메소드를 오버라이딩하는경우 오버라이딩이 가능하다.
	 * */
	void absmethod();
	
	/* default 키워드를 사용하면 non-static 메소드도 작성 가능하다 (JDK 1.8 부터 추가된 기능) */
	public default void defaultMethod() {
		System.out.println("InterProduct의 defaultMethod 호출됨...");
	}
	
}
