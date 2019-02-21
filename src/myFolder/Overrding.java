package myFolder;

public class Overrding extends Overloading  {
	static void BonoBono() {
	System.out.println("이제 보노보노의 조개는 제것입니다.");
	}
	
	static void BonoBono(String str) {
	System.out.println("보노보노가  먹던" + str + "는 이제 제 점심입니다.");
	}
	
	static void BonoBono(String str, String str2) {
		System.out.println(str+str2);
	}
	
	static String BonoBono(String str, int a) {
	return ("보노보노가  먹던" + str + " " + a + "개를 뺏어 먹습니다.");
	}
	static String BonoBono(int a, String str) {
	return ("저는  보노보노에게 " + str + "를 " + a + "마리를 줍니다.");
	}

	public static void main(String[] args) {
		BonoBono();
		BonoBono("조개");
		BonoBono("공사중 ","우회하시오.");
		System.out.println(BonoBono("조개",3));
		System.out.println(BonoBono(3,"조개"));
	}
}
