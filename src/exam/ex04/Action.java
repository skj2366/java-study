package exam.ex04;

public interface Action {
	public String name = "홍길동"; //interface에서 변수를 선언하면 자동으로 static으로 선언된다. 실무에서는 변수 선언 잘 안한다.
	public void speek();
	public void sleep();
	public void eat();
}
