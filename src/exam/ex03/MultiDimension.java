package exam.ex03;

public class MultiDimension { //2019.02.20 1st time
	
	public int[][] nums = new int[100][];
	
	public static void main(String[] args) {
		MultiDimension md = new MultiDimension();
		
		//다차원 배열의 초기화.
		for(int i = 0; i<md.nums.length;i++) {
			md.nums[i] = new int[i+1];
			//System.out.println(i+" 층의 방 개수 : " + md.nums[i].length);
		}
		//다차원 배열의 초기화 끝.
		
		//
		int num = 1;
		for(int i = 0; i<md.nums.length;i++) {
			System.out.print(i+"번째  : ");
			for(int j=0;j<md.nums[i].length;j++) {
				md.nums[i][j] = num++;
				System.out.print(md.nums[i][j] + ",");	
			}
			System.out.println("");
		}
		 //선생님 풀이 .(num 선언 후 num++만 .)
		
		
//		for(int i = 0; i<md.nums.length;i++) {
//			System.out.print(i+"번째  : ");
//			for(int j=0;j<md.nums[i].length;j++) {
//				for(int k=j;k<md.nums[i].length;k++) {
//					md.nums[i][j] = k;
//				}
//				System.out.print(md.nums[i][j] + ",");	
//			}
//			System.out.println("");
//		}
		
//		md.nums[0] = new int[10]; // md.nums[0] 의 데이터타입은 int배열 ;
//		md.nums[0][0] = 1;		  // md.nums[0][0] 의 데이터타입은 int ;
//		
//		System.out.println(md.nums[0][0]);
	}

}
