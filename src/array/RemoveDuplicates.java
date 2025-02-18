package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String args[]){
        int arr[] = {5,3,9,5,6,3,9};
        Arrays.sort(arr);
        for(int i =0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
