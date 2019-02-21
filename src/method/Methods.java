package method;

public class Methods {
	int test(int a,String str) {
		return 0;
	}
	void test(String str,int a) {
		System.out.println(a + str);
	}
	static String getStr() {
		return "abc";
	}
	static void setStr(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Methods md = new Methods();
		setStr("abc");
		String str = getStr();
		System.out.println(str);
		md.test("d",3);
		System.out.println(md.test(1, str));
	}

}
