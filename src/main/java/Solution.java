import java.util.*;

public class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        Map<String, Integer> memo = new HashMap<>();
        return dfs(events, 0, k, 0, memo);

    }

    private int dfs(int[][] events, int index, int k, int currentDay, Map<String, Integer> memo) {
        if (index == events.length || k == 0) {
            return 0;
        }
        if (memo.containsKey(index + " " + k + " " + currentDay)) {
            return memo.get(index + " " + k + " " + currentDay);
        }

        int result = 0;
        int take = 0;
        if (events[index][0] >= currentDay) {
            take = events[index][2] + dfs(events, index + 1, k - 1, events[index][1] + 1, memo);
        }
        int doNothing = dfs(events, index + 1, k, currentDay, memo);
        result = Math.max(take, doNothing);

        memo.put(index + " " + k + " " + currentDay, result);
        return result;
    }
}
