import java.util.*;
public class Bj25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());
        int total = 0;
        for(int i = 0; i<N; i++){
            String[] strings = sc.nextLine().split(" ");

            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);
            total += a*b;
        }
        if(total==X){System.out.println("Yes");}else{ System.out.println("No");}

    }
}
