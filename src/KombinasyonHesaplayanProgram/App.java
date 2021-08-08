package KombinasyonHesaplayanProgram;

import java.util.Scanner;

public class App {
public static void main(String[] args) {

    int n,r;
    Scanner sc=new Scanner(System.in);

    System.out.println("Küme eleman sayısını giriniz : ");
    n=sc.nextInt();

    System.out.println("Alt küme eleman sayısını giriniz : ");
    r=sc.nextInt(); 
    if(n<0||r>n||r<0){
        System.out.println("Hatalı sayı girdiniz!");
    } else{
        int diff=n-r;
        int diffFactor=1;
        int nFactor=1;
        int rFActor=1;
        for(int i=1,j=1,k=1;i<=n;i++,j++,k++){
            nFactor*=i;
            System.out.println(nFactor + "n");
          
            if(diff>r){
                if(k>diff){
                    continue;
                }
                diffFactor*=k;
                System.out.println(diffFactor +"diff");
                if(j>r){
                    continue;
                }
                rFActor*=j;
                System.out.println(rFActor+ "r");
            } else{
                if(j>r){
                    continue;
                }
                rFActor*=j;
                System.out.println(rFActor+ "r");
                if(k>diff){
                    continue;
                }
                diffFactor*=k;
                System.out.println(diffFactor +"diff");
            }
    
        }
        int result =nFactor/(rFActor*diffFactor);
        System.out.println(result);
    }
   
    sc.close();
}    
}