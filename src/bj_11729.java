import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class bj_11729 {
    static StringBuilder sb = new StringBuilder();
    static void hanoi(int K, int start, int temp, int end) {
        if(K==1){
            sb.append(start + " " + end+ "\n");
            return;
       }
       hanoi(K-1, start, end, temp);//전 원판까지 가운데로 이동
       sb.append(start + " " + end+"\n");
       hanoi(K-1, temp, start, end);//전 원판들을 가운데에서 끝으로 이동
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        System.out.println((int)(Math.pow(2, K)-1));
        hanoi(K, 1,2,3);
        System.out.println(sb.toString());
    }
}
