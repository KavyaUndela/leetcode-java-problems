class Solution {
    public int numOfWays(int n) {
        long mod=1000000007;
        long abc=6;
        long aba=6;
        for(int i=2;i<=n;i++){
            long newabc=(abc*2+aba*2)%mod;
            long newaba=(abc*2+aba*3)%mod;
            abc=newabc;
            aba=newaba;
        }
        return (int)((abc+aba)%mod);
    }
}