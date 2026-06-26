class Solution {
    public int hIndex(int[] citations) {
int n = citations.length;
int start = 0;
int end = n - 1;
int ans = 0;

while (start <= end) {
    int mid = start + (end - start) / 2;

    int papers = n - mid;

    if (citations[mid] >= papers) {
        ans = papers;
        end = mid - 1;
    } else {
        start = mid + 1;
    }
}

return ans;
    }
}