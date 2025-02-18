package array;
import java.util.*;

public class largestelementarray {
    public static void main(String args[]){
        int arr[] = {10 , 8 ,9, 6,4};
        Arrays.sort(arr);
        for (int i= 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("the largest element in the array is:"+ arr[arr.length-1]);

    }
}
