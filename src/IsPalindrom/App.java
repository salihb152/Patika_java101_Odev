package IsPalindrom;

public class App{

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;
        
        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(242));
        System.out.println(isPalindrom(243));


    }
}