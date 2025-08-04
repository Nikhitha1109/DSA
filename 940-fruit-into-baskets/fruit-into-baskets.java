import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, maxFruits = 0;
        Map<Integer, Integer> fruitCount = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);

            while (fruitCount.size() > 2) {
                int leftFruit = fruits[left];
                fruitCount.put(leftFruit, fruitCount.get(leftFruit) - 1);
                if (fruitCount.get(leftFruit) == 0) {
                    fruitCount.remove(leftFruit);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }
}
