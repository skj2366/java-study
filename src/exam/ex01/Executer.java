package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();
		System.out.println(f.toString());
		
		/*Father f1 = new Father();
		Object o = f1;
		Father f2 = (Father)o;
		//o.printInfo(); 에러남.
		f2.printInfo();*/
		
		Object f1 = new Father();
		Son s = new Son();
		Father f2 = new Father();
		f2 = new Son();
		
		Object obj = new Son();
		Father f3 = new Son();
		Son s1 = new Son();
		
//		f3.printInfo();
//		s1.printInfo();
		
//		obj = s1;
//		f3 = s1;
		
		Object[] objs = new Object[3];
		
		objs[0] = obj;
		objs[1] = f3;
		objs[2] = s1;
		((Father)objs[1]).printInfo();
		
		/*Father f4 = (Father)objs[1];
		f4.printInfo(); => ((Father)f4).printInfo();*/ 
		
		
	}
}
