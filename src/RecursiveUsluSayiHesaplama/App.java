package RecursiveUsluSayiHesaplama;

import java.util.Scanner;

public class App {

    static int usluSayı(int a, int b){
        if(b==0){
            return 1;
        }
        return usluSayı(a, b-1)*a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      
        System.out.println(" Üssü alınacak sayı yı girin : ");
        int num= sc.nextInt();
      
        System.out.println("Üs olacak sayısını giriniz : ");
        int usNum=sc.nextInt();

        System.out.println("Result : "+ usluSayı(num, usNum));
        sc.close();
    }
}
