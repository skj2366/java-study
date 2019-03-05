package myFolder;

class ehdrms{
	ehdrms(){
		System.out.println("동근");
	}
}

final class whddls extends ehdrms{
	whddls(){
		System.out.println("종인");
	}
}

class tjsals extends whddls {
	tjsals(){
		
	}
}

public class ExamClass {
	
	public static void main(String[] args) {
		ExamClass ec = new ExamClass();
		whddls wd = new whddls();
		//System.out.println(wd);
	}
}
