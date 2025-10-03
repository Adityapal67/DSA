package Leetcode.Leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = reverse(1534236469);
        System.out.println(n);
    }
    public static int reverse(int x){

        long ans = 0;
        while (x != 0){
            int rem = x%10;
            ans = ans*10 + rem;
            x/=10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE) return 0;
        return (int) ans;
    }
}
