import java.util.*;
import java.io.*;

class Solution1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            printSeries(a,b,n);
             System.out.println();
            
        }
        in.close();
        
        
        
        
       // System.out.println(powerOfTwo(1));
       // System.out.println("8 14 26 50 98");
    }
    
    
	//custom logic to calculate power of 2
    public static int powerOfTwo(int num){
     
        if(num==0){
            return 1;
        }
        
        int value =1;
        for (int i = 0; i < num; i++) {
           value= value*2;
        }
        
        return value;
        
    }
    
    public static void printSeries(int a,int b,int n){
       int lastValue=0;
        for (int i = 0; i <= n-1; i++) {
            if(i==0){
               int value =  a+(powerOfTwo(i) )*b ;
               System.out.print(value);
               lastValue=value;
            }else{
              int value=  lastValue+ (powerOfTwo(i) )*b;
              System.out.print(value);
              lastValue=value;
            }
            
            System.out.print(" ");
        }
    }
}
