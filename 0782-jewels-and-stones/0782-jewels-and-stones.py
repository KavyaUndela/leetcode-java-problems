class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        ans=0
        for i in stones:
            for j in jewels:
                if i == j:
                    ans = ans + 1
                    break;
        return ans