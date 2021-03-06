import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Assert;


public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;


        SelectionSort temp1 = new SelectionSort();
    temp1.basicSelectionSort(arr);

      // System.out.println(arr[0]);
      // System.out.println(arr[1]);
      // System.out.println(arr[2]);
      // System.out.println(arr[3]);
      // System.out.println(arr[4]);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
    }

    public void testNegative(){

    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;


        SelectionSort temp1 = new SelectionSort();
    temp1.basicSelectionSort(arr);

       //System.out.println(arr[0]);
       //System.out.println(arr[1]);
      // System.out.println(arr[2]);
       //System.out.println(arr[3]);
       //System.out.println(arr[4]);
    }

    public void testMixed(){

    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = 0;
        arr[4] = 2;


        SelectionSort temp1 = new SelectionSort();
    temp1.basicSelectionSort(arr);

       //System.out.println(arr[0]);
       //System.out.println(arr[1]);
       //System.out.println(arr[2]);
       //System.out.println(arr[3]);
       //System.out.println(arr[4]);
    }

    public void testDuplicates(){

    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 2;
        arr[2] = -8;
        arr[3] = 10;
        arr[4] = 2;


        SelectionSort temp1 = new SelectionSort();
    temp1.basicSelectionSort(arr);

       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[2]);
       System.out.println(arr[3]);
       System.out.println(arr[4]);

    }
}
