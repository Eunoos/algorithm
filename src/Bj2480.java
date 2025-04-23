import java.util.*;
public class Bj2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        if(a==b){
            if(b==c){
              System.out.println(10000+a*1000);
            }else {
                System.out.println(1000+a*100);
            }
        }
        else{
            if(b==c){
                System.out.println(1000+b*100);

            } else if (a==c) {
                System.out.println(1000+a*100);
            }else {
                System.out.println(Math.max(Math.max(a,b), c)*100);
            }
        }
    }
}
