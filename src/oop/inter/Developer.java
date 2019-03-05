package oop.inter;//2019.03.05

public class Developer implements Work {

	@Override
	public void goOffice() {
		System.out.println("개발자가 출근을 합니다.");
	}

	@Override
	public void working() {
		System.out.println("개발자가 일을 합니다.");
	}

	@Override
	public void goHome() {
		System.out.println("개발자가 퇴근을 합니다.");
	}

	@Override
	public void eat() {
		System.out.println("개발자가 밥을 먹습니다.");
	}

}
