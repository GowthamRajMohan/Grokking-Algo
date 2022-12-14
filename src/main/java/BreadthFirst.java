import java.util.*;

/**
 * @project Grokking_algorithms
 * @name gowtham on 9/16/22
 */
public class BreadthFirst {
    private static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search("you");
    }

    public static boolean search(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if(!searched.contains(person)) {
                if(personIsSeller(person)) {
                    System.out.println(person + " is a Mango seller");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return false;
    }

    private static boolean personIsSeller(String name) {
        return name.endsWith("m");
    }
}
