import java.util.*;

public class Nonrepeat {
    public static void main(String[] args) {
        
        String s = "Programming";

        char arr[] = s.toCharArray();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch) == 1){
                System.out.printf("Non - Repeating Character : %c ",ch);
                break;
            }
        }
    }
}
