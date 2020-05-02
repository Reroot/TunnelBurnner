package FireCode;

public class bubbleSort {
	
	public static int[] bubs(int[] arr) {
		int temp = 0;
		for(int bubLen = arr.length;bubLen>0;bubLen--) {
			for(int j = 1;j<arr.length;j++) {
				if(arr[j] <  arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.print(i);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//run bubble length from the end, O(n^2)

		System.out.println(bubs(new int[] {1,3,4,2,5}));
	}

}
