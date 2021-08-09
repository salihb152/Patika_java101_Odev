package Fibonacci;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int prevTotal=0;
        int nextTotal;
        int total=1; 
        int count=2;
        while(count<num){
            nextTotal=prevTotal+total;
            System.out.println(prevTotal+ " + "+ total+ " = "+ nextTotal);
            prevTotal=total;
            total=nextTotal;
            count++;
        }
        sc.close();
    }
}
