import java.util.Scanner;

public class anagram {
    public static void main(String args[]){
        String s = new String("kanak");
        s = s.toLowerCase();
        String og = s;
        StringBuilder newStr = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            newStr.append(s.charAt(i));
        }
        if(og.equals( newStr.toString())){
            System.out.println("string is anagram");
        }else{
            System.out.println("string is not anagram"+ " ");
        }

    }
    }

