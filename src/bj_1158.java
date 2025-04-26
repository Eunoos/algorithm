import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bj_1158 {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
        for(int i=1; i<=10; i++) que.offer(i);

        System.out.println(que);

        Collections.reverse((List<?>) que);

        System.out.println(que);

    }
}
