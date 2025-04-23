import java.util.*;
public class bj_3036 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] strings = sc.nextLine().split(" ");
        for(int i=1; i<N; i++){
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[i]);
            while (b !=0){
                int temp = b;
                b = a%b;
                a = temp;
            }
            System.out.println(Integer.parseInt(strings[0])/a+"/"+Integer.parseInt(strings[i])/a);
        }
    }
}
