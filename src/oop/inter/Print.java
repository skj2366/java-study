package oop.inter;

import oop.inherit.Animal;

public class Print implements PrintSome {

	@Override
	public void printString(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	@Override
	public void printChar(char c) {
		// TODO Auto-generated method stub
		System.out.println(c);
	}

	@Override
	public void printInt(int num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Print p = new Print();
		
		p.printString("abc");
		p.printChar('3');
		p.printInt(3);
		
		PrintSome ps = new Print();
		Animal a = new Animal();
		a.run();
	}

}
