/**
 *Insertion Sort implementation
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */

public class InsertionSort{
  public static void insertionSort(int [] numbers){

    for(int i = 1; i < numbers.length; i++){
      int temp = numbers[i];

      int tempIdex = i - 1;
      while(tempIdex >= 0 && numbers[tempIdex] > temp){
        numbers[tempIdex + 1] = numbers[tempIdex];
        tempIdex--;
      }

      numbers[tempIdex + 1 ] = temp;
    }
  }
}
