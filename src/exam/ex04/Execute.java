package exam.ex04;

public class Execute {
	
	public static void space(Action a) {
		a.sleep();
	}
	public static void main(String[] args) {
		Action c = new Cat();
		Action p = new Person();
		
		space(c);
		space(p);
	}
}

//속성까지 상속받는게 상속 , 인터페이스는 표준.