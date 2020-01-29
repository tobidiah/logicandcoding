public class myBubbleSort {
    public static void main(String[]args){
        int[] myArray = {24, -12, 1000, -3, 0, 0, -45, 67, 312, 82, 4, 9, 1001, 45, 56, -1002};
        bubbleSort(myArray);
        System.out.println(java.util.Arrays.toString(myArray));
    }
    public static void swap(int[]myArray, int i, int j){
        int temp = myArray[i];
        myArray[i]=myArray[j];
        myArray[j]=temp;
    }
    public static void bubbleSort(int[]myArray){
        for(int i = 0; i < myArray.length-1; i++){
            for(int j = 0; j < myArray.length-i-1; j++){
                if(myArray[j] > myArray[j+1]){
                    swap(myArray, j, j+1);
                }
            }
        }
    }
}