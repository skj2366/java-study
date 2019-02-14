package syntax;

public class AreaCondition {

	public static void main(String[] args) {
		int i = 10 ;
		
		// if문은 위에서 부터 비교하고, 조건 충족시 연산을 stop 한다.
		if(i == 1) {
			System.out.println("i는 1");
		}else if(i < 10) {
			System.out.println("i는 10보다 작다");
		}else if(i > 10) {
			System.out.println("i는 10보다 크다");
		}else {
			System.out.println("i는 10이다.");
		}
	}
}
