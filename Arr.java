import java.util.*;

public class Arr {

   public static void main(String[] args) {

   // initializing unsorted int array
   int[] iArr = {2, 1, 9, 6, 4};

   // let us print all the elements available in list
   for (int number : iArr) {
   System.out.println( number);
   }
int searchVal=9;
   // sorting array
   int retVal = Arrays.binarySearch(iArr,searchVal);

   // let us print all the elements available in list
   System.out.println("Index is:"+retVal);
   }
}