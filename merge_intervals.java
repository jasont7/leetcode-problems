import java.util.*;

public class merge_intervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];

        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));

        ArrayList<int[]> merged = new ArrayList<>();

        int j = 1;
        int[] currInterval = intervals[0];
        while (j < intervals.length) {
            if (overlap(currInterval, intervals[j]) == 1)
                currInterval[1] = intervals[j][1];
            else if (overlap(currInterval, intervals[j]) == -1) {
                merged.add(currInterval);
                currInterval = intervals[j];
            }
            j++;
        }
        merged.add(currInterval);

        return merged.toArray(new int[merged.size()][]);
    }

    private int overlap(int[] currInterval, int[] nextInterval) {
        if (nextInterval[0] <= currInterval[1] && nextInterval[1] >= currInterval[1])
            return 1; // There is overlap
        else if (nextInterval[0] <= currInterval[1])
            return 0; // Next interval is upper-bounded by current interval
        return -1; // No overlap
    }
}
