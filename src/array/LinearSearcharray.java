package array;

public class LinearSearcharray {
    public static int linearsearch(int arr[], int k){
        for(int i= 0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {4,5,8,3,9};
        System.out.println(linearsearch(arr,9));
    }
}
