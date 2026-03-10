class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans=true;
        if(n<=0){
        return false;
        }
        return(n&n-1)==0;
    }
}