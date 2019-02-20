package exam.ex03;

//import java.util.Scanner;

public class Cat {
	
	public String name;
	public int age;
	
	public String toString() {
		return "이 고양이의 이름은 " + name + " 이고, 나이는 " + age + " 입니다.";
	}
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		Cat[] c = new Cat[100];
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Cat();
			c[i].name = "고양이" + (i+1);
			c[i].age = i+1;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].name);
			System.out.println(c[i].age);
			System.out.println(c[i]); //Object.toString을 실행한다. 
		}
			
		
	}

}
