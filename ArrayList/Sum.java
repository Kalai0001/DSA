import java.util.Scanner;
import java.util.ArrayList;
public class Sum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        

        int sum = 0;

        for(int num : list){
            sum = sum + num;
        }

        System.out.printf("list : %s\n",list);
        System.out.printf("Sum : %d",sum);

        sc.close();
    }
}