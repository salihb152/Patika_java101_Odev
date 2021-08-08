package TersUcgenYapimi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      int num;
      Scanner sc= new Scanner(System.in);
      System.out.println("Basamak sayısı : ");
      num=sc.nextInt();
        for(int i=num-1; i>=0; i--){
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
             }
            for (int k = 1; k <= (2 * i+1); k++) {
              System.out.print("*");
           }
              System.out.println();
         }
         sc.close();
    }
}
