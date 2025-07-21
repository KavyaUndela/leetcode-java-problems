class Solution(object):
    def mostWordsFound(self, sentences):
        ans=0
        for i in sentences:
            temp = 1
            for j in i:
                if j == " ":
                    temp = temp + 1 
            ans = max(ans, temp )
        return ans