package syntax;

public class Condition2 { //2019.02.21
	
	public static void main(String[] args) {
		int a = 3;
//		String str = "a는 3이 아니다.";
//		if(a==3) {
//			str = "a는 3이다.";
//		}
		String str = (a==3)?"a는 3이다.":"a는 3이아니다."; // 3항연산자 , a==3이니? 참 : a는 3이다. 거짓 : a는 3이 아니다.
		System.out.println(str);
		
		String s1 = "Dog";
		System.out.println(s1.equals("dog"));
		System.out.println(s1.equalsIgnoreCase("dog")); //대소문자 무시.
		System.out.println(s1.toLowerCase().equals("dog"));//개발자 들이 주로 사용하는 방법 , 전체를 소문자로 변경후 비교
		System.out.println(s1);
	}

}
