package EbobEkok;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;

        System.out.println("İlk sayıyı giriniz : ");
        num1=sc.nextInt();

        System.out.println("İkinci Syayıyı giriniz : ");
        num2=sc.nextInt();
        int min=Math.min(num1, num2);
        while(min>0){
            if(num1%min==0&&num2%min==0){
                break;
            }
            min--;
        }
        int max=num1*num2;
        int count=Math.max(num1,num2);
        while(count<=max){
            if(count%num1==0&&count%num2==0){
                break;
            }
            count++;
        }
        System.out.println("Obeb : "+ min);   
        System.out.println("Okek : "+ count);
        
        sc.close();

    }
}
