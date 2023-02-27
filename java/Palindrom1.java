// import java.util.*;

// public class Palindrom {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         String rev="";
//         //int length=sc.nextInt();
//         int length=a.length();
//         for(int i=a.length()-1;i>=0;i--)
//         rev=rev+a.charAt(i);
//         if(a.equals(rev)){
//             System.out.println("Given string is palindrome");
//         }
//         else{
//             System.out.println("Given string is not palindrome");
//         }
//     }
// }

public class Palindrom1{
    public static void main(String[] args){
    String a="malayalam";
    String rev="";
    int length=a.length();
    for(int i=a.length()-1;i>=0;i--)
    rev=rev+a.charAt(i);
    if(a.equals(rev)){
    System.out.println("Given string is palindrome");
    }
    else{
    System.out.println("Given string is not palindrome");
    }
    }
    }
    

