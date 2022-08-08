package Kunaljava;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        
        
        while(true){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            if (n<0){
                break;
            }
            
            
            if(true){
              if( n % 2 == 0)
              
              { System.out.println("not a prime because divisible by 2");
                continue;
             }
             if (n>3 && n % 3==0)
             {
                System.out.println("not a prime because divisible by 3");
                continue;
             }
             if(n>5 && n % 5==0)
             {
                System.out.println("not a prime because divisible by 5");
                continue;
             }
             if(n>7 && n % 7==0)
              {
                System.out.println("not a prime becasue divisible by 7");
                continue;
              }
            }
            
        
            
            
        
        
    
        
            System.out.println("prime number");
            continue;
            
    


        }
        System.out.println("The End");
        
    }

}
