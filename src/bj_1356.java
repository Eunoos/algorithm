import java.util.*;
public class bj_1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String result = "NO";
        for(int i=1; i<N.length(); i++){
            String str1 = N.substring(0,i);
            String str2 = N.substring(i);
            int ans1 = 1;
            int ans2 = 1;
            for(int x=0; x<str1.length(); x++){
                ans1*=Integer.parseInt(String.valueOf(str1.charAt(x)));
            }
            for(int y=0; y<str2.length(); y++){
                ans2*=Integer.parseInt(String.valueOf(str2.charAt(y)));
            }
            if(ans1==ans2){
                result = "YES";
                break;
            }
        }
        System.out.println(result);
    }
}
