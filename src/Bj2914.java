import java.util.Scanner;

public class Bj2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        System.out.println(a*(b-1)+1);
    }
}
