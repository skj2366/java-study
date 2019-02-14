package syntax;

public class ClassExam {
	int a = 1;
	char c = '1';
	String s = "1";
	
	void test() {
		System.out.println("³­ ClassExam²¨!");
	}
	
	public static void main(String[] args) {
		int a = 1;
		ClassExam ce = new ClassExam();
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		ce.test();
	}

}
