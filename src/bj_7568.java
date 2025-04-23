import java.util.*;

public class bj_7568 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int [][] arr = new int[N][2];
        //입력받기
        for(int i = 0; i<N; i++){
            String[] strings = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(strings[0]);
            arr[i][1] = Integer.parseInt(strings[1]);
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
        }
        //구현
        for(int i=0; i<N; i++){
            int rank = 1;//순위
            for(int j=0; j<N; j++){
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1])//둘다 작을시 덩치밀림
                {
                    rank+=1;
                }
            }
            System.out.print(rank+" ");
        }
    }
}
