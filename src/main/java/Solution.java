import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        return dfs(events, 0, k, 0);

    }

    private int dfs(int[][] events, int index, int k, int currentDay) {
        if (index == events.length || k == 0) {
            return 0;
        }

        int result = 0;
        int take = 0;
        if (events[index][0] >= currentDay) {
            take = events[index][2] + dfs(events, index + 1, k - 1, events[index][1] + 1);
        }
        int doNothing = dfs(events, index + 1, k, currentDay);
        result = Math.max(take, doNothing);

        return result;
    }
}
