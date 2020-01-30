import java.util.Scanner;
public class myBubbleSortInput {
    public static void main(String[]args){
        Scanner boo = new Scanner(System.in);
        System.out.println("Please input an integer for the length of the array");
        int x = boo.nextInt();
        int[] myArray= new int[x];
        System.out.println("Please fill the array with integers");
        for(int i = 0; i <= myArray.length-1; i++){
            int j = boo.nextInt();
            myArray[i] = j;
        }
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