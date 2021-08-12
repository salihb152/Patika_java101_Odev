package ArrayHarmonik;
public class Main{
    public static void main(String[] args) {
        double[] list={1, 2, 3, 4, 5};
        double sum=0;
        double avarage;
    

        for(double d: list){
            sum+=1/d;
        }
        avarage=list.length/sum;
        System.out.println(avarage);
            
    }
}