package MukemmelSayiBulma;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        num=sc.nextInt();
        int total=0;
        int max=num/2;
        for(int i =1;i<=max;i++){
            if(num%i==0){
                total+=i;
            }
        }
        if(total==num){
            System.out.println(num+" Mükemmel sayıdır");
        }else{
            System.out.println(num+" Mükemmel sayı değildir.");
        }
        sc.close();
    }
    
}
