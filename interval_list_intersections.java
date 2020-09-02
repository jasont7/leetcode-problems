import java.util.*;

public class interval_list_intersections {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            int aStart = A[i][0], aEnd = A[i][1];
            int bStart = B[j][0], bEnd = B[j][1];

            if (aEnd <= bEnd) {
                if (aEnd >= bStart && bStart >= aStart)
                    ans.add(new int[]{bStart, aEnd});
                else if (aEnd >= bStart)
                    ans.add(new int[]{aStart, aEnd});
                i++;
            } else {
                if (bEnd >= aStart && aStart >= bStart)
                    ans.add(new int[]{aStart, bEnd});
                else if (bEnd >= aStart)
                    ans.add(new int[]{bStart, bEnd});
                j++;
            }
        }

        int[][] result = new int[ans.size()][];
        int resultInd = 0;
        for (int[] intersect : ans) {
            result[resultInd++] = intersect;
        }
        return result;
    }
}
