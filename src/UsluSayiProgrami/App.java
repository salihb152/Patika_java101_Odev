package UsluSayiProgrami;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        int num,pow;

        Scanner sc= new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz ");
        num=sc.nextInt();

        System.out.print("Üs olacak sayıyı giriniz : ");
        pow=sc.nextInt();   
      
        int result=1;
        double negativeResult=1;
       
        if(pow<0){
            for(int i =0; i<Math.abs(pow); i++){
                negativeResult/=num;             
             }
            
             System.out.println(negativeResult);
        } else {
           
            for(int i =0; i<pow; i++){
                result*=num;
            }
           
            System.out.println(result);
        }
       
        sc.close();
    }
    
}
