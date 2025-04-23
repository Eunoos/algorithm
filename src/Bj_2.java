import java.util.*;

public class Bj_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        double a = Integer.parseInt(strings[0]);
        double b = Integer.parseInt(strings[1]);
        double c = Integer.parseInt(strings[2]);

        int result1 = (int)(a*b/c);
        int result2 = (int)(a/b*c);
        System.out.println(Math.max(result1, result2));
        //println 줄바꿈 print 줄바꿈없음
    }
}