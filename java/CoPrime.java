import java.util.*;

public class CoPrime {
    public static void main(String args[]){
        int b=72, count=0; 
        if(b>0){
            for(int a=1;a<b;a++){
                if(GCD(a,b)==1){
                    count++;
                    System.out.println(a);
                }
            }
            System.out.println(count);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    class Main{
        static int GCD(int a,int b){
            if(a==0){
                return b;
            }
            return GCD(b%a, a);
        }
   }
}   

