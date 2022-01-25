/**
 * Merge Sort implementation
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */


import java.util.*;
public class MergeSort{
// recursively dividing the array
  public static void mergeSort(int [] numbers) {

    int length = numbers.length;

    if(length < 2){
      return;
    }
    int middleIndex = length/2;
    int [] leftHalf = new int[middleIndex];
    int [] rightHalf = new int[length - middleIndex];

  for(int i = 0; i < middleIndex; i++){
    leftHalf[i] = numbers[i];
  }

  for(int i = middleIndex; i < length; i++){
    rightHalf[i - middleIndex] = numbers[i];
  }
  mergeSort(leftHalf);
  mergeSort(rightHalf);
  merge(numbers, leftHalf, rightHalf);
  }

// merging the sub-array
private static void merge(int [] numbers, int [] leftHalf, int []rightHalf) {
  int leftSize = leftHalf.length;
  int rightSize = rightHalf.length;

  int leftIndex = 0, rightIndex = 0, InputArrayIdx = 0;

  while(leftIndex < leftSize && rightIndex < rightSize ){
      if(leftHalf[leftIndex] <= rightHalf[rightIndex]){
        numbers[InputArrayIdx] = leftHalf[leftIndex];
        leftIndex++;
      }else {
        numbers[InputArrayIdx] = rightHalf[rightIndex];
        rightIndex++;
      }

      InputArrayIdx++;
  }

 while(leftIndex < leftSize ){
   numbers[InputArrayIdx] = leftHalf[leftIndex];
   leftIndex++;
   InputArrayIdx++;
 }

 while(rightIndex < rightSize){
   numbers[InputArrayIdx] = rightHalf[rightIndex];
   rightIndex++;
   InputArrayIdx++;
 }
}
// printing the values of the array
  public static void printArray(int [] numbers){
    for(int number: numbers){
        System.out.print(number + " ");
    }
    System.out.println();
  }

}
