package GirilenSayilardanMinVeMaxDegerBulanProgram;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ne kadar sayı girmek istiyorsunuz : ");
        int select=sc.nextInt();
        int number=0;
        int temp1=Integer.MIN_VALUE;
        int temp2=Integer.MAX_VALUE;
        for(int i=1; i<=select; i++){
            System.out.println("Sayı giriniz : ");
            number=sc.nextInt();
            temp1=Math.max(temp1, number);
            temp2=Math.min(temp2,number);
        }
        System.out.println("En büyük sayı : "+ temp1);
        System.out.println("En küçük sayı : "+ temp2);
        sc.close();
    }
    
}
