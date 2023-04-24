package DSA.Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private static final int WHITE = 0;
    private static final int GRAY = 1;
    private static final int BLACK = 2;
    private static class Vertex{
        int color;  // white, grey or black for not visited, visited but not explored and fully visited and explored respectively.
        int d;      // distance from starting vertex s.
        Vertex pi;  // Previous vertex.
        ArrayList<Vertex> adj;  // adjacent vertex's list.

        Vertex(){
            color = WHITE;
            d = Integer.MAX_VALUE;
            pi = null;
            adj = new ArrayList<>();
        }
    }
    public static void bfs(ArrayList<Vertex> graph, Vertex s ){
        for (Vertex u : graph) {
            if (u != s) {
                u.color = WHITE;
                u.d = Integer.MAX_VALUE;
                u.pi = null;
            }
        }
        s.color = GRAY;
        s.d = 0;
        s.pi = null;
        Queue<Vertex> Q = new LinkedList<>();
        Q.offer(s);
        while (!Q.isEmpty()) {
            Vertex u = Q.poll();
            for (Vertex v : u.adj) {
                if (v.color == WHITE) {
                    v.color = GRAY;
                    v.d = u.d + 1;
                    v.pi = u;
                    Q.offer(v);
                }
            }
            u.color = BLACK;
        }
    }
}