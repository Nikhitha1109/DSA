import java.util.*;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0, n = nums.length;
        while (i < n) {
            int start = i;
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start == i) {
                result.add(String.valueOf(nums[i]));
            } else {
                result.add(nums[start] + "->" + nums[i]);
            }
            i++;
        }
        return result;
    }
}
