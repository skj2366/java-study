package exam.ex01;

public class Car11 implements Drive11 {

	private String name;
	private int year;
	
	Car11(String name, int year){
		this.name = name;
		this.year = year;
	}
	
	public String toString() {
		return "차이름 : " + this.name + ", 년식  : " + year;
	}
	
	public String getString() {
		return "str";
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
