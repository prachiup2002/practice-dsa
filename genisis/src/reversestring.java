import java.util.Scanner;

public class reversestring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        StringBuilder newStr = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            newStr.append(str.charAt(i));
        }
        System.out.println(newStr);
    }


    }

