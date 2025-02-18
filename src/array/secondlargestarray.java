package array;

import java.util.Arrays;

public class secondlargestarray {
    public static void main(String args[]) {
        int [] arr = new int[] {9, 10, 5, 3, 6};
        Arrays.sort(arr);
        System.out.println("second largest element:" + arr[arr.length-2]);
    }
}
