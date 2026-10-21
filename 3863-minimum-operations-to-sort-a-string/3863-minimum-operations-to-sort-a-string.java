class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        
        if (n == 2) return -1;
        
        char minChar = arr[0], maxChar = arr[0];
        for (char c : arr) {
            if (c < minChar) minChar = c;
            if (c > maxChar) maxChar = c;
        }
        
        if (arr[0] == minChar || arr[n - 1] == maxChar) {
            return 1;
        }
        
        boolean uniqueMaxAtStart = true, uniqueMinAtEnd = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxChar && i != 0) uniqueMaxAtStart = false;
            if (arr[i] == minChar && i != n - 1) uniqueMinAtEnd = false;
        }
        
        if (arr[0] == maxChar && arr[n - 1] == minChar && uniqueMaxAtStart && uniqueMinAtEnd) {
            return 3;
        }
        
        return 2;
    }
}