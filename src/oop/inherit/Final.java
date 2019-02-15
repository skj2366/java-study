package oop.inherit;

public class Final {

	final int num = 3; //const(타언어 ..ex,c) 상수화.
	//final int num; 상수는 초기화 안하면 사용 불가, 자바에서 자동으로 변경도 불가.(int num에서 초기화를 안했을때 자동으로 0으로 초기화 안됨.)
	
	/*또는
	 *final int num;
	 *Final(){
	 *num = 3;
	 *}
	 *이건 사용가능 , bcuz. main의 Final f = new Final();라인이 실행되면서 f.num의 정의가 탄생하기 때문. 
	 */
	
	
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.num);
		//f.num = 3; 상수라서 대입 불가 ~ 
	}
}
