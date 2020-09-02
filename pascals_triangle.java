import java.util.*;

public class pascals_triangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
            return Arrays.asList();
        if (numRows == 1)
            return Collections.singletonList(Collections.singletonList(1));

        List<List<Integer>> T = new ArrayList<>(List.of(Collections.singletonList(1), Arrays.asList(1, 1)));
        for (int i=1; i < numRows-1; i++) {
            List<Integer> lastRow = T.get(i);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j=0; j < T.get(i).size()-1; j++) {
                int sum = lastRow.get(j) + lastRow.get(j+1);
                newRow.add(sum);
            }
            newRow.add(1);
            T.add(newRow);
        }

        return T;
    }
}
