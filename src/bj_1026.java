import java.util.*;

public class bj_1026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        int [] idx = new int[N];
        int S = 0;
        String[] stringA = sc.nextLine().split(" ");
        String[] stringB = sc.nextLine().split(" ");
        for(int i=0; i<N; i++){
            A[i]= Integer.parseInt(stringA[i]);
            B[i]= Integer.parseInt(stringB[i]);
        }
        //A 오름차순 정렬
        Arrays.sort(A);
        //B 정렬 금지, 정렬하지 않고 최대값 인덱스 배열을 따로 만들어줌
        for(int i=0; i<N; i++){
            int cnt = 1;
            for(int j=0; j<N; j++){
                if(i!=j && B[i]>B[j]){
                    cnt+=1;
                }else if(B[i]==B[j]){
                    if(i<j){
                        cnt+=1;
                    }
                }
            }
            idx[i]=cnt;
        }
        for(int i=0; i<N; i++){
            S+=A[N-idx[i]]*B[i];
        }
        System.out.println(S);
    }
}
