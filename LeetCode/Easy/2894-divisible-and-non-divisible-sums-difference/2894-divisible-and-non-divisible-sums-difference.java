class Solution {
    public int differenceOfSums(int n, int m) {
        int divide = 0;
        int remain = 0;

        for(int i = 1; i <= n; i++) {
            if(i % m == 0) {
                remain += i;
            } else {
                divide += i;
            }
        }

        return divide - remain;
    }
}