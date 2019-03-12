package mrLee;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,4,1,7,3};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}
}
