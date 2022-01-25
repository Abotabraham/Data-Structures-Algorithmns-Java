/**
 * bubble sort implementation
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */

public class BubbleSort{
  public static void bubbleSort(int [] numbers){
    int length = numbers.length;
    for(int i = 0; i < length-1; i++){
      for(int j = 0; j < length-i-1; j++){
          if(numbers[j] >= numbers[j+1]){
            swap(numbers, j, j+1);
          }
      }
    }
  }


  private static  void  swap(int [] numbers, int index1, int index2){
    int temp = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = temp;
  }

}
