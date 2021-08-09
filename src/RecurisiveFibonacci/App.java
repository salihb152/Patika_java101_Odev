package RecurisiveFibonacci;

public class App {
    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(0);
        for(int i=1; i<10; i++){
            System.out.println(fibo(i));
        }
    }
}
