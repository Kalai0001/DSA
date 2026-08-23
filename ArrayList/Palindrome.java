import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

    public static String palindrome(ArrayList<Integer> list){

        int i = 0; int j = list.size() - 1;

        while (i < j) {
            if( list.get(i) != list.get(j)){
                return "Not an Palindrome";
            }
            i++;
            j--;
        }

        return "Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        String ans = palindrome(list);

        System.out.println(ans);

        sc.close();
    }
}
