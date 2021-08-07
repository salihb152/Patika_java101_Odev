package TekSayilarinToplami;

import java.util.Scanner;
public class App {
    public static void main(String[] args){
       
       // tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
       
        int num, total=0;
        Scanner sc= new Scanner(System.in);
        
        do{
            num=sc.nextInt();
            if(num%4==0){
                total+=num;
            }
        
        } while(num%2==0);
        System.out.println(total);
        sc.close();
    }
    
}
