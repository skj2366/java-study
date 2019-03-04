package oop.abst;//2019.03.04
interface Viewer{
	void show();
	void off();
}
public class AnonymouseTest {
	public static void main(String[] args) {
		Viewer v = new Viewer() {
			public void show() {
				System.out.println("삼성 티비 킴");
			}
			public void off() {
				System.out.println("삼성 티비 끔");
			}
		};
		v.show();
		v = new Viewer() {
			public void show() {
				System.out.println("엘지 티비 킴");
			}
			public void off() {
				System.out.println("엘지 티비 킴");
			}
		};
		v.show();
		
	}
}
