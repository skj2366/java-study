package exam.ex04;

public class Cat implements Action{ // implements 상위개념인 Action도 Cat의 이름으로 불릴수 있다. 
	// So, Cat = Object, Action, Cat

	@Override
	public void speek() {
		// TODO Auto-generated method stub
		System.out.println("야옹~");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 잔다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 먹는다.");
	}
	
	public void eat(String foodName) {
		System.out.println("고양이가 " + foodName + "을 먹습니다.");
	}

}
