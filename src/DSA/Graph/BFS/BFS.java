package DSA.Graph.BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> G, int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        ArrayList<Integer> visited = new ArrayList<>();
        while (!q.isEmpty()) {
            int u = q.poll();
            if (!visited.contains(u)) {
                visited.add(u);
                for (int i : G.get(u)) {
                    if (!visited.contains(i)) {
                        q.add(i);
                    }
                }
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<Integer>(){{add(1); add(2);}});    // vertex 0
        graph.add(new ArrayList<Integer>(){{add(0); add(2); add(3);}}); // vertex 1
        graph.add(new ArrayList<Integer>(){{add(0); add(1); add(4);}}); // vertex 2
        graph.add(new ArrayList<Integer>(){{add(1); add(4); add(5);}}); // vertex 3
        graph.add(new ArrayList<Integer>(){{add(2); add(3); add(6);}}); // vertex 4
        graph.add(new ArrayList<Integer>(){{add(3);}}); // vertex 5
        graph.add(new ArrayList<Integer>(){{add(4);}}); // vertex 6
        System.out.println(bfs(graph, 0)); // output: [0, 1, 2, 3, 4, 5, 6]
    }
}
