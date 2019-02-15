package oop;

public class ThisExam {
	int num = 10;
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return this.num;
	}
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(30);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}

}
