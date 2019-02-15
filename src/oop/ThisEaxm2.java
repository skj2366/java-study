package oop;

public class ThisEaxm2 {
	int num1;
	String str;
	
	ThisEaxm2(int num1, String str) {
		this.num1 = num1;
		this.str = str;
		System.out.println(this.num1);
		System.out.println(this.str);
	}
	
	public static void main(String[] args) {
		ThisEaxm2 te = new ThisEaxm2(10,"abc");
	}
}

/*package oop;

public class ThisEaxm2 {
	int num1;
	String str;
	
	ThisEaxm2(){}
	
	ThisEaxm2(int num1, String str){
		this.num1 = num1;
		this.str = str;
		System.out.println(this.num1);
		System.out.println(this.str);
	}
	public static void main(String[] args) {
		ThisEaxm2 te = new ThisEaxm2(10,"abc");
		
	}

}
*/