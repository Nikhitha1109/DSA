class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(lst, new ArrayList<>(), nums, 0);
        return lst;
    }

    public void backtrack(List<List<Integer>> lst, List<Integer> tempList, int[] nums, int start) {
        lst.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(lst, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
