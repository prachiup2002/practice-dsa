package array;

public class ArrayisSorted {
    public static void main(String args[]){
        int arr[]= {1,2,3};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                continue;

            }
            else{
                System.out.println("not in order");
                break;
            }
        }
    }
}
