/**
 * java APPLICATION class
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */

import java.util.*;
public class SelectionSortApp{

  public static void main(String[] args) {
   Random random = new Random();
   int [] numbers = new int[10];

   for(int i = 0; i < numbers.length; i++){
     numbers[i] = random.nextInt(100);
   }

   System.out.println("Before Sorting: ");
    System.out.println(Arrays.toString(numbers));
    SelectionSort.selectionSort(numbers);
    System.out.println("After Sorting: ");
    System.out.println(Arrays.toString(numbers));

  }
}
