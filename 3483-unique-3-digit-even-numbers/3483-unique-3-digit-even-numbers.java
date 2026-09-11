class Solution {
    public int totalNumbers(int[] digits) {
     
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Step 2: Iterate through all 3-digit even numbers
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;          // Hundreds digit
            int d2 = (num / 10) % 10;   // Tens digit
            int d3 = num % 10;          // Units digit

            // Count required frequency for this candidate number
            int[] needed = new int[10];
            needed[d1]++;
            needed[d2]++;
            needed[d3]++;

            // Step 3: Verify if available digits meet the requirement
            if (freq[d1] >= needed[d1] && freq[d2] >= needed[d2] && freq[d3] >= needed[d3]) {
                count++;
            }
        }

        return count;
    }
}