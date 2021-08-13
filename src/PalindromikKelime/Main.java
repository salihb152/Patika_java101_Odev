package PalindromikKelime;

import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String s=scan.nextLine().trim();
        if(!s.isEmpty()){
            if(isPalindrome(s)){
                System.out.println(s + " bir palindrom kelimedir");
            } else{
                System.out.println(s + " bir palindrom kelime değildir");
            }
        }else{ 
            System.out.println("hatalı kelime girsiniz");
        }
        scan.close();
    }
}