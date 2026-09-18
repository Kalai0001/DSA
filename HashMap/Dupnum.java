import java.util.HashMap;

public class Dupnum {
    public static void main(String[] args) {
        
        int arr[] = { 1, 2 , 1 , 4 , 5 , 1 , 2 , 5 , 2 , 1, 6 , 8 };

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0 ) + 1);
        }

        for(int num : map.keySet()){
            if(map.get(num) >= 2){
                System.out.printf("Duplicate Number : %d Occurence : %d\n",num,map.get(num));
            }
        }
    }
}
