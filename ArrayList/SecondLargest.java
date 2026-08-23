import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        int max = 0;
        int secondmax = 0;
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        for(int num : list){
            if(num > secondmax && num != max){
                secondmax = num;
            }
        }
        System.out.printf("List : %s\n",list);
        System.out.printf("Max : %d\n",max);
        System.out.printf("SecondMax : %d",secondmax);

        sc.close();
    }
}
