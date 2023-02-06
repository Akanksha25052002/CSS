import java.util.*;

public class Palindrom {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        String rev="";
        int length=s.length();
        for(int i=length-1;i>=0;i--)
        rev=rev+s.charAt(i);
        if(sc.equals(rev)){
            System.out.println("After reversing :"+rev);
        
        }
    }
}
