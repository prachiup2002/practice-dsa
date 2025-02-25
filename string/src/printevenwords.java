public class printevenwords {
    public static void main(String argsw[]){
        String s= new String("sky is beautiful IDEA Community Edition");
        String arr[] = s.split(" ");
        for(int i=0; i<arr.length; i++) {
            if(i%2==0){
                System.out.println(arr[i]);
            }

        }

    }
}
