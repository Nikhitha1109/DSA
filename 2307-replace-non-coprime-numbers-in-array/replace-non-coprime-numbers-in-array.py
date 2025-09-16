class Solution(object):
    def replaceNonCoprimes(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        stack=[]
        for num in nums:
            stack.append(num)
            while len(stack)>1:
                g=self.gcd(stack[-1],stack[-2])
                if g==1:
                    break
                merged=self.lcm(stack[-1],stack[-2])
                stack.pop()
                stack[-1]=merged
        return stack

    def gcd(self,a,b):
            if a<b:
                a,b=b,a
            while b!=0:
                a,b=b,a%b
            return a
    def lcm(self,a,b):
            return (a*b)//self.gcd(a,b)

        
