package exam.ex01;

public class ObjectArray11 {
	
	/*private String name;
	private int year;
	
	ObjectArray(String name,int year){
		this.name = name;
		this.year = year;
	}*/
	
	public static void main(String[] args) {
		Drive11 d = new Car11("소나타",2013);
		/*Object obj = d;
		System.out.println(d.toString());
		System.out.println(d);
		//System.out.println(d.getString());
		
		Object oa = new ObjectArray("소나타",2013);
		System.out.println(oa);*/
		
		Object[] objs = new Object[5];
		objs[0] = new String("abc");
		objs[1] = d;
		objs[2] = new Car11("aa",11);
		objs[3] = new ObjectArray11();
		objs[4] = 1;
		
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
		
	}

}
