package exam;

class Dog{
	
}

class Cat{
	
}

class Duck{
	
}

class Infos{
	int age;
	String type;
	int size;
}

public class examTest {
	
	public static void main(String[] args) {
		Infos[] info = new Infos[10];
		for(int i=0;i<info.length;i++) {
			info[i] = new Infos();
			info[i].age = i+1;
			info[i].type = i+1+"";
			
		}
		
		for(int i=0;i<info.length;i++) {
			//System.out.println(info[i]);
			System.out.println(info[i].age);
			System.out.println(info[i].type);
			System.out.println(info[i].size);
		}
	}

}
