import java.util.Scanner;

public class greatestoftwo {
    public static void main(String ard[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }

    }
}
