package oop;

public class ClassExam3 {
	
	int num = 1;
	
	void setNum() {
		System.out.println(num);
	}
	
	int getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		ClassExam3 ce = new ClassExam3();
		
		System.out.println(ce.num);
		ce.num = 5;
		//ce = new ClassExam3();
		System.out.println(ce.getNum());
		ce.setNum();
		//System.out.println(ce.num);
	}

}
