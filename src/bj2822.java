import java.util.*;
class bj2822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] ints = new Integer[8];
        Integer[] arr = new Integer[8];
        int[] ans = new int[5];
        int mx = 0;
        for(int i=0; i<8; i++){
            int v = sc.nextInt();
            ints[i]=arr[i]=v;

        }
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(int i=0; i<5; i++){
            int result = arr[i+3];
            ans[i] = Arrays.asList(ints).indexOf(result)+1;
            mx+=result;
        }
        Arrays.sort(ans);
        System.out.println(mx);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
