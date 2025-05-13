class Solution {
    private static final long mod = 1000000007;
    private long mod_add(long a, long b) {
        a %= mod; b %= mod;
        return ((a + b) % mod + mod) % mod;
    }
    public int lengthAfterTransformations(String s, int t) {
        long[] nums = new long[26];
        for (char ch : s.toCharArray()) nums[ch - 'a']++;
        while (t-- > 0) {
            long[] cur = new long[26];
            for (int j = 0; j < 26; j++) {
                if (j == 25 && nums[j] > 0) {
                    cur[0] = mod_add(cur[0], nums[j]);
                    cur[1] = mod_add(cur[1], nums[j]);
                } else {
                    if (j < 25) cur[j + 1] = mod_add(cur[j + 1], nums[j]);
                }
            }
            nums = cur;
        }
        long cnt = 0;
        for (long i : nums) cnt = mod_add(cnt, i);
        return (int) cnt;
    }
}
