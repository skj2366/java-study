package oop.inherit;

class GrandFather{
	void work() {
		System.out.println("할아버지가 농사를 짓습니다.");
	}
}

class Father extends GrandFather{
	void work() {
		super.work();
		System.out.println("아빠가 일함.");
	}
}

public class Son extends Father{
	void work() {
		super.work();
		System.out.println("아들이 공부함.");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
	
}

/*
 * 아빠 클래스에도 work() 메소드가 있고 아들에게도 work() 메소드가 있을시 아들의 메소드로 덮어씌어서 실행 함(없어지진않는다). 
 * 아들의 work()가 실행됨. 이것이 overrides(오버라이드s)
 * super.메소드 => 상위 클래스의 메소드를 자식에서 실행.
 */
