import java.util.Scanner;

public class bj_2992 {
    static int num, len;
    static char[] arr, list;
    static boolean[] visited;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        num = Integer.parseInt(X);
        len = X.length();
        arr = X.toCharArray();
        
        visited = new boolean[len];

    }
}
