class Solution {
    public int romanToInt(String s) {
        long ans = 0, prev = 0;
        for(char c: s.toCharArray()){
            int curr = 0;
            switch(c){
                case 'I' -> curr = 1;
                case 'V' -> curr = 5;
                case 'X' -> curr = 10;
                case 'L' -> curr = 50;
                case 'C' -> curr = 100;
                case 'D' -> curr = 500;
                case 'M' -> curr = 1000;
            }
            if(prev<curr){
                ans = ans -prev;
                ans += curr -prev;
            }else{
                ans += curr;
            }
            prev = curr;
        }
        return (int) ans;
    }
}