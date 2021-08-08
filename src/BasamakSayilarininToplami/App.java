package  BasamakSayilarininToplami;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);

        System.out.println(" Bir sayı giriniz");

        num= sc.nextInt();
        int tempNum;
        if(num>=0){
         tempNum=num;
        } else{
         tempNum=Math.abs(num);
        }
        
        int total=0;
        int remainder=0;

        while(tempNum!=0){
            remainder=tempNum%10;
            total+=remainder;
            tempNum/=10;
        }
        System.out.println(total);
        sc.close();
    }
}
