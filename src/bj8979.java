import java.util.*;

class Medal implements Comparable<Medal>{
    int num;
    int gold;
    int sliver;
    int bronze;
    int rank;

    public Medal (int n, int g, int s, int b){
        this.num = n;
        this.gold = g;
        this.sliver = s;
        this.bronze = b;
        this.rank = 1;
    }

    @Override
    public int compareTo(Medal o) {
        if(this.gold==o.gold){
            if(this.sliver==o.sliver){
                return o.bronze-this.bronze;
            }else{
                return o.sliver-this.sliver;
            }
        }else{
            return o.gold - this.gold;
        }
    }
}
public class bj8979 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        ArrayList<Medal> medals = new ArrayList<>();

        for(int i=0; i<n; i++){
            strings = sc.nextLine().split(" ");
            int num = Integer.parseInt(strings[0]);
            int g = Integer.parseInt(strings[1]);
            int s = Integer.parseInt(strings[2]);
            int b = Integer.parseInt(strings[3]);
            medals.add(new Medal(num, g, s, b));
        }
        Collections.sort(medals);

        for(int i=1; i<n; i++){
            Medal prev = medals.get(i-1);
            Medal cur = medals.get(i);
            if(prev.gold == cur.gold && prev.sliver == cur.sliver && prev.bronze == cur.bronze){
                cur.rank = prev.rank;
            } else cur.rank = i+1;
        }
        for(int i=0; i<n; i++){
            if(medals.get(i).num == k){
                System.out.println(medals.get(i).rank);
            }
        }
    }
}
