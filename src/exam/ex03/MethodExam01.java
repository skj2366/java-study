package exam.ex03;

public class MethodExam01 { // 2019.02.20 2nd time
	
	public String name = "김동근";
	
	public static void setTest(MethodExam01 me1) {
		me1 = new MethodExam01();
		System.out.println(me1.name);
	}
	
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		System.out.println(me.name);
		me.name = "임꺽정";
		MethodExam01.setTest(me);
		System.out.println(me.name);
		
	}

}
