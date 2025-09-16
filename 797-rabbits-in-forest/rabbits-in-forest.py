from collections import Counter
import math

class Solution(object):
    def numRabbits(self, answers):
        """
        :type answers: List[int]
        :rtype: int
        """
        count_map = Counter(answers)   
        total = 0

        for x, cnt in count_map.items():
            group_size = x + 1                    
            groups = int(math.ceil(float(cnt) / group_size))
            total += groups * group_size             

        return total
