class Solution(object):
    def sumZero(self, n):
        result=[]
        if n%2==0:
            for i in range(1,int(n/2)+1):
                result+=[i,-i]
        else:
            result+=[0]
            for i in range(1,int((n-1)/2)+1):
                result+=[i,-i]
        return result

        