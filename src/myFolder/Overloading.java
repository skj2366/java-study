package myFolder;

public class Overloading {
	
	static void BonoBono() {
		System.out.println("보노보노가 인사를 합니다.");
	}

	static void BonoBono(String str) {
	System.out.println("보노보노가 " + str + "을(를) 먹습니다.");
	}
	
	static void BonoBono(String str, String str2) {
		System.out.println("보노보노는 " + str + "와" + str2 + "랑 베프입니다.");
	}
	
	static String BonoBono(String str, int a) {
		return ("보노보노가  " + str + " " + a + "개를 먹어서 배불러요.");
	}
	static String BonoBono(int a, String str) {
		return ("보노보노가  " + str + "를 " + a + "번 때립니다.");
	}
	
	public static void main(String[] args) {
		super.BonoBono();
		BonoBono();
		BonoBono("조개");
		BonoBono("포로리", "너부리");
		System.out.println(BonoBono("조개", 3));
		System.out.println(BonoBono(3,"너부리"));
	}
}
