package method;

public class DkMethods {

	static void test() {
		System.out.println("void test();");
	}
	
	static void test(int a) {
		System.out.println("void test(int a);");
	}
	
	static void test(String str) {
		System.out.println("void test(String str);");
	}
	
	static void test(int a,String str) {
		System.out.println("void test(int a,String str);");
	}
	
	static void test(String str, int a) {
		System.out.println("void test(String str, int a);");
	}
	
//	static int test() { // 데이터타입에 상관없이 메소드명, 파라메타 개수, 순서에 상관있는 오버로딩 ! 
//		return "String test";
//	}
	
	
	public static void main(String[] args) {
		test();
		test(1);
		test("");
		test(1,"");
		test("",1);
	}
}
