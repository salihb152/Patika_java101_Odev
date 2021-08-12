package DizidekiElemanlarinFrekansi;

import java.util.Arrays;


public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        
        int startIndex = 0;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
       for(int i =0;i<list.length;i++){
           int count=0;
           for(int j=0;j<duplicate.length;j++){
            if(duplicate[i]==list[j]){
                count++;
            }
            
           }
           if(count>0){
            System.out.println(duplicate[i]+" sayısı "+count+" kere tekrar edildi.");
           }
           
       }

        // for (int value : duplicate){
        //     if (value != 0){
        //         System.out.println(value);
        //     }
        // }
    }
}
