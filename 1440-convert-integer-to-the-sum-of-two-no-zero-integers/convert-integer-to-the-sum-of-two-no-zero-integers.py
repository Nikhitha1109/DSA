class Solution(object):
    def getNoZeroIntegers(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        def isno(x):
            return '0' not in str(x)
        for a in range(1,n):
            b=n-a
            if isno(a) and isno(b):
                return [a,b]