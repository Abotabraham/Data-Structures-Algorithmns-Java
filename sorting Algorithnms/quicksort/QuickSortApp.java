import java.util.*;

public class QuickSortApp{

  public static void main(String[] args) {
   Random random = new Random();
   int [] numbers = new int[10];

   for(int i = 0; i < numbers.length; i++){
     numbers[i] = random.nextInt(100);
   }

   System.out.println("Before Sorting: ");
    QuickSort.printArray(numbers);
    System.out.println(Arrays.toString(numbers));
    QuickSort.quickSort(numbers, 0, numbers.length -1 );
    System.out.println("After Sorting: ");
    System.out.println(Arrays.toString(numbers));
  // MergeSort.printArray(numbers);
  }
}
