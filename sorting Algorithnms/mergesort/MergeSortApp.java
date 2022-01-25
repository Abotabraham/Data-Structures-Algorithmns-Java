import java.util.*;

public class MergeSortApp{

  public static void main(String[] args) {
   Random random = new Random();
   int [] numbers = new int[]{1, 0, 5, 7, 9, 8, 4, 3,2};

   for(int i =0; i < numbers.length; i++){
     //numbers[i] = random.nextInt(100);
   }

   //System.out.println("Before Sorting: ");
    //MergeSort.printArray(numbers);
    System.out.println(Arrays.toString(numbers));
    MergeSort.mergeSort(numbers);


  //System.out.println("After Sorting: ");
  ///MergeSort.printArray(numbers);
  }
}
