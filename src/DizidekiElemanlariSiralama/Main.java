package DizidekiElemanlariSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
    
        int n;

        System.out.println("Dizinin boyutu n : ");
        n=scan.nextInt();
        if(n<0){
            n=0;
        }

        int[] arr= new int[n];

        for(int i =0; i<arr.length;i++){
             System.out.print("Dizinin elemanlarını giriniz : ");
             arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
    
    


    
    
}
