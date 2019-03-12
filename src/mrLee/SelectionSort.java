package mrLee;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,4,1,7,3};
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
		//System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);	
//		}
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
}
