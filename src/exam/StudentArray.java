package exam;

class Student{
	String name;
	int grade;
	String schoolName;
	
}
public class StudentArray {
	
	public static void main(String[] args) {
		Student[] students = new Student[10];
		for(int i = 0;i<students.length;i++) {
			students[i] = new Student();
			students[i].name = "g";
			students[i].grade = i+1;
		}
		
		for(int i = 7 ; i < students.length; i++) {
			System.out.println("students[" + i + "].grade : " + students[i].grade);
		}
		//System.out.println(students[9].grade);
		
	}

}
