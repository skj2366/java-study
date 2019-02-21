package syntax;

public class Loop2 { //20190221
	
	public static void main(String[] args) {
//		int i=10;
//		for(;i>=0;i--) {
//			System.out.println(i);
//		}
		
		for(int i=1;i<10;i++) {
			System.out.println(i + " 단 ");
			System.out.println("-----------");
			for(int j=1;j<10;j++) {
				System.out.println( i + " x " + j + " = " + i*j);
			}
		}
	}

}
