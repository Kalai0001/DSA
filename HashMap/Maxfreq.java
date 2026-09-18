import java.util.HashMap;


public class Maxfreq {
    public static void main(String[] args) {
        
        int arr[] = { 1 , 2 , 4 , 2 , 3 , 2 , 1 , 5 , 3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        
        int n = 0;
        int occur = 0;

        for(int num : map.keySet()){
            if(map.get(num) > occur){
                occur = map.get(num);
                n = num;
            }
        }

        System.out.printf("Number with Most Frequency : %d \n Occurence : %d",n,occur);
    }
}
