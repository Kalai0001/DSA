import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movezeros {
    public static int[] ans(ArrayList<Integer> list){

        int res[] = new int[list.size()];
        int a = 0;

        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != 0){
                res[a] = list.get(i);
                a++;
            }
            else{
                count++;
            }
        }

        for(int i = 0; i < count; i++){
            res[i + a] = 0;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int res[] = ans(list);

        System.out.println(Arrays.toString(res));

        sc.close();
    }
}
