package oop.inter;//2019.03.05

public class Execute {

	public static void main(String[] args) {
		Work w = new Developer();
						
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();
		
		w = new Manager();
				
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();
		
	}
}
