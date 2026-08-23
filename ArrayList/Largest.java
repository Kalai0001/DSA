import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        int max = 0;
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        System.out.printf("List : %s\n",list);
        System.out.printf("Max : %d",max);

        sc.close();
    }
}
