import java.util.Arrays;
import java.util.Scanner;

import java.util.*;

public class bj2529 {

    static  int n;
    static String[] arr;
    static boolean[] used;
    static List<String> list = new ArrayList<>();

    public static void dfs(String word, int idx){
        if(idx==n+1){
            list.add(word);
            return;
        }
        for (int i=0; i < 10; i++) {
            if((idx == 0 || check(Character.getNumericValue(word.charAt(idx - 1)), i , arr[idx-1]))&&!used[i]){
                used[i] = true;
                dfs(word+i, idx+1);
                used[i] = false;
            }
        }
    }
    static boolean check(int a, int b, String c){
        if(c.equals(">")){
            if(a < b) return false;
        } else if (c.equals("<")){
            if(a > b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //조합문제
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        used = new boolean[10];
        arr = sc.nextLine().split(" ");

        dfs("",0);
        System.out.println(list.get(list.size()-1));
        System.out.print(list.get(0));
    }
}
