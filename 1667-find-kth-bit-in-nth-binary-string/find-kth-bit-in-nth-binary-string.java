class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int length = (1 << n) - 1; // Length of S_n is 2^n - 1
        int mid = length / 2 + 1; // Mid point is (2^n - 1) / 2 + 1

        if (k == mid) return '1';
        if (k < mid) {
            return findKthBit(n - 1, k);
        } else {
            // Calculate the mirror position in the reversed and inverted part
            int mirroredK = 2 * mid - k;
            char mirroredBit = findKthBit(n - 1, mirroredK);
            // Invert the mirrored bit
            return mirroredBit == '0' ? '1' : '0';
        }
    }
}
