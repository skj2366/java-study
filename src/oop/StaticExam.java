package oop;

public class StaticExam {
	static int num = 1;
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		System.out.println(StaticExam.num);// 1
		se.num=10;
		se = new StaticExam();
		System.out.println(se.num); //10
		System.out.println(StaticExam.num); //10
	}
}
