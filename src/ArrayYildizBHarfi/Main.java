package ArrayYildizBHarfi;


public class Main {

    public static void main(String[] args) {
        String[][] letter=new String[7][4];
        for(int i =0; i<letter.length; i++){
            for(int j=0;j<letter[i].length;j++){
                if(i==0||i==3||i==6){
                    System.out.print(" * ");
                } else if(j==0||j==3){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}
