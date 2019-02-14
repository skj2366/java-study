package syntax;

public class Condition {

	public static void main(String[] args) {
		// 조건문을 어떻게 사용하느냐에 따라서 프로그램의 가독성이 달라진다.
		int num1 = 1;
		int num2 = 2;
		
		boolean isEqual = num1==num2;
		if(isEqual) {
			System.out.println("num1과 num2는 같습니다.");
		}else {
			System.out.println("num1과 num2는 다릅니다.");
		}
		
		// 같냐고 물어볼때는 ==
		// 다르냐고 물어볼때는 !=
		// ! <-- 부정연산자
		// !true => false
		// !false => true
	}
}
