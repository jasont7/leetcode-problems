import java.util.*;

public class destination_city {
    public String destCity(List<List<String>> paths) {
        ArrayList<String> nonDest = new ArrayList<>();
        for (List<String> path : paths) {
            if (!nonDest.contains(path.get(0)))
                nonDest.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!nonDest.contains(path.get(1)))
                return path.get(1);
        }
        return "";
    }
}
