

class BubbleSort{
       //display array elements
    public static void displayArray (int arr[]){
       for(int i=0 ; i < arr.length ; i++){
        System.out.print( arr[i] + " ");
       }
    }
public static void main(String[] args) {
   int arr[] = {3,15,1,0,8,2,4,5,7,2,9,6};

   // time complexity = O(n^2);
   //bubble sort
   for(int i=0 ; i < arr.length ; i++){
    for(int j=0 ; j < arr.length-i-1 ; j++){

       if(arr[j] > arr[j+1]){

        //swap
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
       }
    }
   }
   displayArray(arr);

}
}