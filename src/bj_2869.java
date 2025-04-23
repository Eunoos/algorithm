import java.util.*;
 class bj_2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int A = Integer.parseInt(strings[0]);
        int B = Integer.parseInt(strings[1]);
        int V = Integer.parseInt(strings[2]);
        int cnt = 1;
        if ((V-A)%(A-B)==0) cnt = (V-A)/(A-B)+1;
        else cnt = (V-A)/(A-B)+2;
        System.out.println(cnt);
    }
}
