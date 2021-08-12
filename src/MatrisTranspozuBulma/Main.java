package MatrisTranspozuBulma;
public class Main{
    public static void main(String[] args) {
        int[][] matris={
            {1,2,3},
            {4,5,6}
        };
    
        int[][] transpose= new int[matris[0].length][matris.length];
    
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                transpose[j][i]=matris[i][j];
            }
        }
        System.out.println("Matris : ");
        for(int[] i: matris){
            for(int n: i ){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
        System.out.println("Transpose : ");
        for(int[] i: transpose){
            for(int n: i ){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
    }

}