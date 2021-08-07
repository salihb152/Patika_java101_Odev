package DortveBesinKuvvetleriVeriliSayiyaKadar;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
// girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program        
        int num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();

        for(int j=1,i= 1;i<=num||j<=num; i*=4,j*=5){
            System.out.println(i);
            if(j>num){
                break;
            }
            System.out.println(j);
            
        }
        sc.close();
}
    
}
