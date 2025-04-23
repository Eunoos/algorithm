import java.util.*;
 class bj_2635 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = Integer.parseInt(sc.nextLine());
         List<Integer> arr = new ArrayList<Integer>();
         List<Integer> ans = new ArrayList<Integer>();
         int mx = 0;
         for(int i=1; i<=N; i++){
             arr.clear();
             int temp = 0;
             int cnt = 2;
             int int1 = N;
             int int2 = i;
             arr.add(int1);
             arr.add(int2);
             while(true){
                 if(int1<int2) break;
                 cnt+=1;
                 temp = int1-int2;
                 int1 = int2;
                 int2 = temp;
                 arr.add(int2);
             }
             if(mx<cnt){
                 mx=cnt;
                 ans.clear();
                 ans.addAll(arr);
            }
        }
        System.out.println(mx);
         for(int i = 0; i < ans.size(); i++) {
             System.out.print(ans.get(i) + " ");
         }
    }
 }
