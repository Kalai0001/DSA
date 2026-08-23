import java.util.Scanner;
import java.util.ArrayList;

public class Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        
        int target = sc.nextInt();
        boolean flag = false;
        for(int num : list){
            if(target == num){
                System.out.print("Yes");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.printf("No");
        }

        sc.close();
    }
}
