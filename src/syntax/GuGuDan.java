package syntax;

public class GuGuDan {
	
	static void guGuDan(int eDan, int eSu) {
		for(int sDan = 1; sDan <= eDan; sDan++) {
			int sSu = 1;
			for(; sSu < eSu; sSu++) {
				System.out.print(sDan + " X " + sSu + " = " + (sDan * sSu) + ", ");
				if(sDan * sSu < 10) {
					System.out.print(" ");
				}
				if(sDan * sSu < 100) {
					System.out.print(" ");
				}
				if(sDan < 10) {
					System.out.print(" ");
				}
			}
			System.out.println(sDan + " X " + sSu + " = " + (sDan * sSu));
		}
	}

	public static void main(String[] args) {
//		guGuDan(20,20);

		for(int dan = 9; dan > 1; dan--) {
			int su = 9;
			for(; su > 1; su--) {
				System.out.print(dan + " X " + su + " = " + (dan * su) + ", ");
				if(dan * su < 10) {
					System.out.print(" ");
				}
			}
			System.out.println(dan + " X " + su + " = " + (dan * su));
		}
	}
}