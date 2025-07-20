class Solution(object):
    def defangIPaddr(self, address):
        ans = ""
        for i in address:
            if i == ".":
                ans = ans + "[.]"
            else:
                ans = ans + i
        return ans