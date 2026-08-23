import java.util.ArrayList;
import java.util.Scanner;

public class Commonelements {
    public static ArrayList<Integer> res(ArrayList<Integer> list1,ArrayList<Integer> list2){

        ArrayList<Integer> ans = new ArrayList<>();
        for(int num1 : list1){
            for(int num2 : list2){
                if(num1 == num2){
                    ans.add(num1);
                }
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list1.add(sc.nextInt());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> ans = res(list1,list2);

        System.out.println(ans);

        sc.close();
    }
}
