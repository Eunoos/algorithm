
import java.util.Scanner;
import java.util.*;

public class bj_2529 {

    static  int n;
    static String[] arr;
    static boolean[] used;
    static List<String> list = new ArrayList<>();

    public static void dfs(String val, int idx){
        //완료 및 추가
        if(idx==n+1){
            list.add(val);
            return;
        }

        for (int i=0; i < 10; i++) {
            //앞의 숫자랑 비교
            //val문자열의 하나를 char로 뽑아서 다시 int로 변환
            if((idx == 0 || check(Character.getNumericValue(val.charAt(idx - 1)), i , arr[idx-1]))&&!used[i]){
                used[i] = true;
                dfs(val+i, idx+1);
                used[i] = false;
            }
        }
    }
    static boolean check(int a, int b, String s){
        if(s==">"){
            if(a < b) return false;
        } else if (s=="<"){
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

