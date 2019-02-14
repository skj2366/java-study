package syntax;

public class MultiConditions {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 4;
		
		// 둘다 OK 일때, TRUE
		if(num1 == 1 && num2 == 4) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
		// 둘중의 하나가 OK 일때, TRUE
		if(num1 == 2 || num2 == 3 || num1 == num2) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}
