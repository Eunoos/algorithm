class Solution {
    public long solution(int price, int money, int count) {
        long x = (long) price*((1+count)*count/2);
        return money>x ? 0 : x-money;
    }
}