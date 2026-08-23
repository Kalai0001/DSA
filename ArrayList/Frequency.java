import java.util.ArrayList;
import java.util.Scanner;

public class Frequency {
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
            if(!list2.contains(num)){
                list2.add(num);
            }
        }

        for(int num1 : list2){
            int count = 0;
            for(int num2 : list1){
                if(num1 == num2){
                    count++;
                }
            }
            System.out.printf("%d  :  %d\n",num1,count);
        }
        sc.close();
    }
}
