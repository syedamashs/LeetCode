//Simple Code Using Builtin Functions

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            int dig = String.valueOf(Math.abs(num)).length();
            if(dig%2==0) count++;}
        return count;}}
