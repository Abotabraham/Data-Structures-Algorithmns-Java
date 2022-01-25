/**
 * selection sort implementation
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */

public class SelectionSort{
  public static void selectionSort(int [] numbers){

    for(int i = 0; i<numbers.length; i++){
       int minimumIndex = i;

       for(int j = i+1; j < numbers.length; j++){
            if(numbers[j] < numbers[minimumIndex]){
                minimumIndex = j;
            }
       }
       if(minimumIndex != i){
         swap(numbers, minimumIndex, i);
       }
    }
  }

private static  void  swap(int [] numbers, int index1, int index2){
    int temp = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = temp;
  }
}
