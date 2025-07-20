class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> counts = new TreeMap<>();
        for (int x : nums) {
            Integer c = counts.get(x);
            if (c == null) c = 0;
            counts.put(x, c + 1);
        }
        int ans = 0;
        var it1 = counts.entrySet().iterator();
        var it2 = counts.entrySet().iterator();
        for (it2.next(); it2.hasNext(); ) {
            var e1 = it1.next();
            var e2 = it2.next();
            if (e1.getKey() + 1 != e2.getKey()) continue;
            ans = Math.max(ans, e1.getValue() + e2.getValue());
        }
        return ans;
    }
}