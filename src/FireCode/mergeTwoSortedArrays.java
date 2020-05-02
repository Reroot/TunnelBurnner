package FireCode;

public class mergeTwoSortedArrays {
	public static int[] merge(int[] arrLeft, int[] arrRight){
		int lenRight = arrRight.length;
		int lenLeft = arrLeft.length;
		int[] merged = new int[arrLeft.length+arrRight.length];
		//3 indicies 
		int indleft = 0, indRight = 0, indMerged = 0;
		//sort the sorted by leftmost
		while(indleft < lenLeft && indRight < lenRight) {//fill the array
			if(arrLeft[indleft] < arrRight[indRight]) {
				merged[indMerged++] = arrLeft[indleft++];
			} else {
				merged[indMerged++] = arrRight[indRight++];
			} 
		}
		while(indleft < lenLeft) {///while there's left in len
			merged[indMerged++] = arrLeft[indleft++];
		}
		while(indRight < lenRight) {
			merged[indMerged++] = arrRight[indRight++];
		}
		return merged;
	}
	public static void main(String[] args) {
		// rec
		System.out.println(merge(new int[] {1,2,4}, new int[] {5,6,8}));
		

	}

}
