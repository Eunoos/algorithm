import java.util.*;
public class bj_1225 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        long ans = 0;
        for(int i=0; i<strings[0].length(); i++){
            for(int j=0; j<strings[1].length(); j++){
                ans += Character.getNumericValue(strings[0].charAt(i))*Character.getNumericValue(strings[1].charAt(j));
            }
        }
        System.out.println(ans);
    }
}
