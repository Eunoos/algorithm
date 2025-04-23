import java.util.*;
public class bj_2897 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int r = Integer.parseInt(strings[0]);
        int c = Integer.parseInt(strings[1]);
        char arr[][] = new char[r][c];
        int[] ints = new int[5];
        Arrays.fill(ints, 0);
        for(int i = 0; i<r; i++){
            String s = sc.nextLine(); //"#..#"
            arr[i] = s.toCharArray(); //['#','.','.','#']
        }
        for(int i=0; i<r-1; i++){
            for(int j=0; j<c-1; j++){
                int sharp = 0, x=0;
                for(int nr=i; nr<i+2; nr++){
                    for(int nc=j; nc<j+2; nc++){
                        if(arr[nr][nc] == '#') sharp ++;
                        else if(arr[nr][nc] == 'X') x++;
                    }
                }
                if(sharp==0){
                    ints[x]+=1;
                }
            }
        }
        for(int i=0; i<5; i++){
            System.out.println(ints[i]);
        }
    }
}

