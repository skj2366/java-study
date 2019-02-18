package exam.ex01;

public class StringEquals2 {
	
	String str = "1";
	
	public static void main(String[] args) {
		StringEquals2 se1 = new StringEquals2();
		System.out.println(se1.str);
		StringEquals2 se2 = new StringEquals2();
		System.out.println(se1==se2); // false
		System.out.println(se1.str==se2.str); //true
		
		se2.str = "2";
		
		System.out.println(se1.str == se2.str);
	}
}
