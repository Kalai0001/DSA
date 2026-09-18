import java.util.*;

public class Onlyone {
    public static void main(String[] args) {
        
        int arr[] = { 1, 2 , 1 , 4 , 5 , 1 , 2 , 5 , 2 , 1, 6 , 8 };

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int num : arr){

            int oldcount = map.getOrDefault(map, 0);

            int newcount = oldcount + 1;

            map.put(num,newcount);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                System.out.printf("Original Number : %d Occurence : %d\n",num,map.get(num));
            }
        }
    }
}
