import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list1.add(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int num : list1){
            if((!list2.contains(num))){
                list2.add(num);
            }
        }
        System.out.printf("Original List : %s\n",list1);
        System.out.printf("Duplicate Removed List : %s",list2);

        sc.close();
    }
}
