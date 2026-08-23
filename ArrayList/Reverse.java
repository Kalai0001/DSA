import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int tmp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,tmp);
            i++;
            j--;
        }

        System.out.printf("List : %s",list);
        sc.close();
    }
}
