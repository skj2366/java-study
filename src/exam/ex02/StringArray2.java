package exam.ex02; //2019.02.19

public class StringArray2 {
	
	public String[] strs; //or 39,40line 생략하고 
						//public String[] strs = new String[10]; 으로 대체 가능 ~ ;
	
//	StringArray2(){
//		String[] strs = new String[2];
//	}
//	
//	public static void main(String[] args) {
//		
//		StringArray2[] sa = new StringArray2[2];
//		
//		for(int i=0;i<sa.length;i++) {
//			sa[i].strs = new String[10];
//		}
//		
//				
//		for(int i=0;i<10;i++) {
//			sa[i].strs[i] = (i+1)+"";
//			sa[i].strs[i] = (10-i)+"";
//		}
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("sa.strs[" + 1 + "] = " + sa[1].strs[i]);
//		}
//		
//		for(int i=10-1;i>=0;i--) {
//			System.out.println("sa.strs[" + 2 + "] = " + sa[2].strs[i]);
//		}
		
	public static void main(String[] args) {
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
		// sa1 방갯수 10개 -> 1~ 10
		// sa2 방갯수 10개 -> 10~1
					
		sa1.strs = new String[10];
		sa2.strs = new String[10];
		
		for(int i=0;i<10;i++) {
			sa1.strs[i] = (i+1)+"";
			sa2.strs[i] = (10-i)+"";
		}
		
		for(int i=0;i<sa1.strs.length;i++) {
			System.out.println("sa.strs[" + i + "] = " + sa1.strs[i]);
			if(sa1.strs[i].equals("10")) {
				System.out.println("---------0 ~ 10---------");
				System.out.println("");
			}
		}
		
		//System.out.println("--------------------");
		
		for(int i=sa2.strs.length-1;i>=0;i--) {
			System.out.println("sa.strs[" + i + "] = " + sa2.strs[i]);
			if(sa1.strs[i].equals("1")) {
				System.out.println("---------10 ~ 0---------");
				System.out.println("");
			}
		}
		
	
	}
}
