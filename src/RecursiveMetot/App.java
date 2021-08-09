package RecursiveMetot;

import java.util.Scanner;

public class App {
    static int recur(int num){
        System.out.println(num);
        int temp=num;
        if(num>0){       
         temp=recur(num-5);
        }
        return temp; 

    }
    static int recur(int num, int temp){
        if(num<=0){
            num=num+5;
        }
        System.out.println(num);
        if(num<temp){
            recur(num+5,temp);
        }  
        return num;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();  
        System.out.println("-------");      
        int temp=num;
        int firstResult=recur(num);
        recur(firstResult,temp);
        sc.close();

    }
}
