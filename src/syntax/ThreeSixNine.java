package syntax;

public class ThreeSixNine {
	
	static void threeSixNine( ) {
		for(int i = 1; i < 99; i++) {
			String num = "";
			num += i;
			if(num.length() == 2) {
				if(num.substring(0,1).equals("3") || num.substring(0,1).equals("6") || num.substring(0,1).equals("9")) {
					System.out.print("짝");
				}else {
					System.out.print(num.substring(0,1));
				}
				if(num.substring(1,2).equals("3") || num.substring(1,2).equals("6") || num.substring(1,2).equals("9")) {
					System.out.println("짝");
				}else {
					System.out.println(num.substring(1,2));
				}
			}else {
				if(num.substring(0,1).equals("3") || num.substring(0,1).equals("6") || num.substring(0,1).equals("9")) {
					System.out.println("짝");
				}else {
					System.out.println(num.substring(0,1));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		for(int i = 1; i < 30; i++) {
			int j = i;
			for(;j > 10 ;j -= 10) {
				
			}			
			if(j % 3 == 0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
		}
//		threeSixNine();
	}
}
