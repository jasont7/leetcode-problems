import java.util.*;

public class find_town_judge {
    public int findJudge(int N, int[][] trust) {
        if (N == 1)
            return 1;
        
        HashMap<Integer, ArrayList<Integer>> trustMap = new HashMap<>();
        for (int[] t : trust) {
            if (!trustMap.containsKey(t[0]))
                trustMap.put(t[0], new ArrayList<>());
            if (!trustMap.containsKey(t[1]))
                trustMap.put(t[1], new ArrayList<>());

            trustMap.get(t[0]).add(t[1]);
        }

        int judge = -1;
        for (int key : trustMap.keySet()) {
            if (trustMap.get(key).isEmpty())
                judge = key;
        }
        for (int key : trustMap.keySet()) {
            if (key == judge)
                continue;
            if (!trustMap.get(key).contains(judge))
                return -1;
        }

        return judge;
    }
}
