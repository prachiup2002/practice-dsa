import java.util.*;
public class evenindex {
    public static void main (String args[]){
        String s = new String("Akshat");
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                System.out.println(s.charAt(i));
            }
        }
    }

}
