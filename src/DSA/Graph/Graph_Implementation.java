package DSA.Graph;

import java.util.ArrayList;

class graph{            // define what is actually a graph.
    //    (u) --> (v)
    public void addEdge(ArrayList<ArrayList<Integer>> arr, int vertex, int adjacent){
        arr.get(vertex).add(adjacent);
    }
    public void printGraph(ArrayList<ArrayList<Integer>> arr){
        for(int i = 0; i<arr.size(); i++){
            System.out.print("\nVertex: "+ i);
            for (int j=0; j<arr.get(i).size(); j++){
                System.out.print("->"+arr.get(i).get(j));
            }
        }
    }
}
public class Graph_Implementation {
    public static void main(String[] args) {
        int V = 5;
        int E = 6;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            arr.add(new ArrayList<Integer>());
        }

        graph obj = new graph();
        obj.addEdge(arr, 0, 1);
        obj.addEdge(arr, 0, 2);
        obj.addEdge(arr, 0, 4);

        obj.addEdge(arr, 1, 0);
        obj.addEdge(arr, 1, 2);

        obj.addEdge(arr, 2, 0);
        obj.addEdge(arr, 2, 1);
        obj.addEdge(arr, 2, 3);

        obj.addEdge(arr, 3, 2);
        obj.addEdge(arr, 3, 4);

        obj.addEdge(arr, 4, 0);
        obj.addEdge(arr, 4, 3);
    }
}
