import java.util.Scanner;

public class leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0)&&(year%100!=0)){
            System.out.println("year is leap year");
        }
        else if(year%400==0){
            System.out.println("year is leap year");
        }else{
            System.out.println("year is not leap year");
        }

    }
}
