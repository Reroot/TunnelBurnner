package FireCode;
//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
//Time Complexity: O(n*2)
//
//Auxiliary Space: O(1)
public class insertionSort {
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}
//Step 1 − If it is the first element, it is already sorted. return 1;
//Step 2 − Pick next element
//Step 3 − Compare with all elements in the sorted sub-list
//Step 4 − Shift all the elements in the sorted sub-list that is greater than the 
//         value to be sorted
//Step 5 − Insert the value
//Step 6 − Repeat until list is sorted