package exam.ex03;

public class Execute {
	
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		
		for(int i=0;i<dogs.length;i++) {
			dogs[i] = new Dog();
			dogs[i].setName("멍멍이" + i);
			dogs[i].setAge(i);
		}
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println(dogs[i].getName());
			System.out.println(dogs[i].getAge()); 
		}
	}
}
