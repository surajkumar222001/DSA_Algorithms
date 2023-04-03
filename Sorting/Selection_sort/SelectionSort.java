package Sorting.Selection_sort;

public class SelectionSort {
    public static void displayArray (int arr[]){
        for(int i=0 ; i < arr.length ; i++){
         System.out.print( arr[i] + " ");
        }
     }
 public static void main(String[] args) {
    int arr[] = {3,15,1,0,8,2,4,5,7,2,9,6};
 
    // time complexity = O(n^2);
    //selection sort
    for(int i=0 ; i < arr.length ; i++){
      int smallest = i ;
     for(int j=i+1 ; j < arr.length ; j++){
        if(arr[smallest] > arr[j]){
            smallest = j;
        }
     }
     //swap
     int temp = arr[smallest];
     arr[smallest] = arr[i];
     arr[i] = temp;
    }
    displayArray(arr);
 
 }
}
