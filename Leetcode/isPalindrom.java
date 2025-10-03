package Leetcode.Leetcode;

public class isPalindrom {
    public static void main(String[] args) {
        boolean palindrom = palindrom(-121);
        System.out.println(palindrom);
    }
    public static boolean palindrom(int x){
        if(x<0) return false;
        int u = 0;
        int original = x;
        while (x != 0) {
            int rem = x % 10;
            u = u * 10 + rem;
            x /= 10;
        }
        if (u == original) return true;
        return false;
    }
}
