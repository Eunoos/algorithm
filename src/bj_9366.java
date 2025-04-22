import java.util.Arrays;
import java.util.Scanner;

public class bj_9366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        //입력받기
        Arrays.sort(strings);
        System.out.println(strings[0]);
    }
}
