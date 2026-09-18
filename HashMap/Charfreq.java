import java.util.*;

public class Charfreq {
    public static void main(String[] args) {

        String s = "Programming";

        char arr[] = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(char ch : map.keySet()){
            System.out.printf("Character : %c  Occurence : %d\n",ch,map.get(ch));
        }



    }
}
