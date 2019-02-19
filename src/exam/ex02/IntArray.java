package exam.ex02;

public class IntArray { //2019.02.19
	
	public int[] nums = new int[10];
	
	public boolean compare(int num) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0) return false;//메서드를 나가는 구문은 if 문 영역을 두지않고 한줄로 둔다 ~ ! (물론 영역을 두어도 된다만 .. )
			if(nums[i] == num) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		IntArray ia = new IntArray();
		
		for(int i=0;i<ia.nums.length;i++) {
			//double db = (Math.random())*10;
			//ia.nums[i] = (int)db;
			// OR 
			//ia.nums[i] = (int)(Math.random()*10)+1;
			// OR
			
//			double db = Math.random();
//			ia.nums[i] = (int)(db*10)+1;
			
//			ia.nums[i] = (int)(Math.random()*10)+1;
//			int num = ia.nums[i];  ==> 이 두줄의 경우는 ia.nums[i]에 이미 [값이 들어간 상태 !] 라서 ! compare에서 이미 들어간 값을 비교 하게 된다. 그래서 무한루프로 돌게됨.
//							       ==> So, 미리 temp 개념의 int 변수를 선언하여 그 값으로 비교후 else로 들어올시 int변수를 ia.nums[i]에 대입 . 끝 . ㅅㅂ .
			
			int num = (int)(Math.random()*10)+1;
			
			if(ia.compare(num)) {
				i--;
			} else {
				ia.nums[i] = num;
			}

			
//			double db = Math.random();
//			ia.nums[i] = (int)(db*10)+1;
//			
//			if(ia.compare(ia.nums[i])) {
//				i--;	
//			} 
			
		}
		
		System.out.println(" ┌─────────────────┐");
		//System.out.println(" │Descending order │");
		System.out.println(" │                 │");
		
		for(int i=0;i<ia.nums.length;i++) {
			if(ia.nums[i] >= 10) {
				System.out.println(" │ ia.nums[" + i + "] = " + ia.nums[i] + " │");
			} else {
				System.out.println(" │ ia.nums[" + i + "] = " + ia.nums[i] + "  │");
			}
		}
		
		for(int i=0;i<ia.nums.length;i++) {
			for(int j=i+1;j<ia.nums.length;j++) {
				if(ia.nums[i] < ia.nums[j]) {
					int tmp=0;
					tmp = ia.nums[i];
					ia.nums[i] = ia.nums[j];
					ia.nums[j] = tmp;
				}
			}
		}
		
		System.out.println(" │                 │");
		
		for(int i=0;i<ia.nums.length;i++) {
			if(ia.nums[i] >= 10) {
				System.out.println(" │ ia.nums[" + i + "] = " + ia.nums[i] + " │");
			} else {
				System.out.println(" │ ia.nums[" + i + "] = " + ia.nums[i] + "  │");
			}
		}
		
		System.out.println(" └─────────────────┘");
		
//		System.out.println(" ┌────────────────┐");
//		System.out.println(" │                │");
//		System.out.println(" └────────────────┘");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" ││││││││││││││││││");
//		System.out.println(" │││││││││││││││││└──────────────");
//		System.out.println(" ││││││││││││││││└────────────────");
//		System.out.println(" │││││││││││││││└──────────────────");
//		System.out.println(" ││││││││││││││└────────────────────");
//		System.out.println(" │││││││││││││└──────────────────────");
//		System.out.println(" ││││││││││││└────────────────────────");
//		System.out.println(" │││││││││││└──────────────────────────");
//		System.out.println(" ││││││││││└────────────────────────────");
//		System.out.println(" │││││││││└──────────────────────────────");
//		System.out.println(" ││││││││└────────────────────────────────");
//		System.out.println(" │││││││└──────────────────────────────────");
//		System.out.println(" ││││││└────────────────────────────────────");
//		System.out.println(" │││││└──────────────────────────────────────");
//		System.out.println(" ││││└────────────────────────────────────────");
//		System.out.println(" │││└──────────────────────────────────────────");
//		System.out.println(" ││└────────────────────────────────────────────");
//		System.out.println(" │└──────────────────────────────────────────────");
//		System.out.println(" └────────────────────────────────────────────────");//└──
		
	}

}
