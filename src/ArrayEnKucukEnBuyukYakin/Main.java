
package ArrayEnKucukEnBuyukYakin;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] list ={15,12,788,1,-1,-778,2,0};
        Scanner scan= new Scanner(System.in);
        int num;
        System.out.println("Bir sayı giriniz : " );
        num= scan.nextInt();

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i: list){
            if(i<num){
                max= max<i ? i:max; //Girilen sayıdan küçük en büyüğü bulur.
            }
            if(i>num){
                min= min>i ? i:min;// girilen sayıdan büyük en küçüğü bulur.
            }
        }
        scan.close();
        System.out.println("Dizi : "+ Arrays.toString(list)+"\n"
        +"Girilen Sayı : "+ num);

        if(max==Integer.MIN_VALUE){//Girilen sayı listedeki en küçük sayı veya ondan daha küçükse max değeri Integer.MIN_VALUE çıkacaktır. Bu durumda Girilen sayıdan küçük en yakın sayı olmayacaktır.
            
                System.out.println("Girilen sayıdan küçük en yakın sayı yok");
           
        }else{
            System.out.println( "Girilen sayıdan küçük en yakın sayı : " + max);  
        }

        if(min==Integer.MAX_VALUE){// Girilen sayı listedeki en büyük sayı veya daha büyük ise min değeri Integer.MAX_VALUE çıkacaktır. Bu durumda Girilen sayıdan büyük en yakın sayı olmayacaktır.
           
                System.out.println("Girilen sayıdan büyük en yakın sayı yok");
             
        } else{
            System.out.println( "Girilen sayıdan büyük en yakın sayı : "+ min); 
        }
    }
}