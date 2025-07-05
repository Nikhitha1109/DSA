import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int remaining) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, remaining, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remaining, int start) {
        if (remaining < 0) return;
        if (remaining == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }else{

        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, remaining - candidates[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
    }
}
