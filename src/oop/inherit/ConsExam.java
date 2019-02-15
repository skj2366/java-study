package oop.inherit;

class Book{
	String name;
	Book(String name){
		this.name = name;
	}
	Book(){
		//this.name = "자바의 정석";
		this("자바의 정석");
	}
}

public class ConsExam extends Book {
	ConsExam(){
		super("자바의 정석"); //아빠의 생성자에 "자바의 정석" 생성 (기본생성자)
	}
	public static void main(String[] args) {
		Book b = new Book();
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
		System.out.println(b.name);
		
		
	}
}
