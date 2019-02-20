package exam.ex03;

public class StaticExam01 { //2019.02.20
	public static String name = "하하";
	public String name1 = "호호";
	
	public static void test() {
		System.out.println(StaticExam01.name);
	}
	
	public static void main(String[] args) {
		StaticExam01 se = new StaticExam01();
//		StaticExam01.name = "히히";
//		StaticExam01 se01 = new StaticExam01();
		se.name1 = "허허허허허";
		se.name = "허허허허허";
		se = new StaticExam01();
		System.out.println(se.name);
		System.out.println(se.name1);
	}

}


// 모든 클래스는 생성시 static ! 
// static 내부에서는 static밖에 못씀, 메모리생성시 가능 .