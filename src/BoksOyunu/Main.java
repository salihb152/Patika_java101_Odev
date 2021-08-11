package BoksOyunu;

public class Main{
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0,true);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 100, false);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}