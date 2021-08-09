package RecursiveIsPrime;

import java.util.Scanner;

public class App {
    static boolean isPrime(int a, long b ){
        if(a<=1){
            return false;
        }
        if(a%b==0){
            if(b==1){
                return true;
            }else{
                return false;
            }
                
        } else{
            return isPrime(a, b-1);
        }
        
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Bir sayı giriniz : ");
    int a= sc.nextInt();
    System.out.println(isPrime(a,(long) Math.sqrt(a)));
    sc.close();
    }
    
}
