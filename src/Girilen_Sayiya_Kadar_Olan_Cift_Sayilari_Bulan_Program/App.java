package Girilen_Sayiya_Kadar_Olan_Cift_Sayilari_Bulan_Program;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
     // 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
     
        int num;
        Scanner sc= new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        num=sc.nextInt();
        int count=0;
        int total=0;
        for(int i=12; i<=num; i+=12){
            total+=i;
            count++;
        }

        System.out.println((double)(total/count));
        sc.close();
    }
}
