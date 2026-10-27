class Solution {
    public String[] createGrid(int m, int n) {
        String[] s = new String[m];
        for(int i = 0;i<m;i++){
            StringBuilder r = new StringBuilder();
            for(int j = 0;j<n;j++){
                if(i==0 || j==n-1) r.append(".");
                else r.append("#");
            }
            s[i] = r.toString();
        }
        return s;
    }
}