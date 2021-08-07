package DortveBesinKuvvetleriVeriliSayiyaKadar;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
// girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program        
        long num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextLong();

        for(long j=1,i= 1;i<=num; i*=4,j*=5){
            System.out.print(i + " dördün katı  ");
            if(j>num){
                continue;
            }
            System.out.println(j + " beşin katı");

        }
        sc.close();
    }
}
