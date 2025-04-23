import java.util.*;
public class bj_17618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int cnt = 0;
        String str = "";
        for(int i=1; i<=N; i++){
            str = i+"";
            int sum = 0;
            for(int j=0; j<str.length(); j++){
                sum += Integer.parseInt(String.valueOf(str.charAt(j)));// char 으로 값을 구한 후 문자열/정수로 변환
            }
            if(i%sum==0) cnt+=1;
        }
        System.out.println(cnt);
    }
}
