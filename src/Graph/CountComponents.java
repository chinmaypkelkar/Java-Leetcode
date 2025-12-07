package Graph;

import java.util.*;

public class CountComponents {
    public int countComponents(int n, int[][] edges) {

        boolean[] visited = new boolean[n];
        int numberOfComponents = 0;
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for(int[] edge : edges){
            adjacencyList.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
            adjacencyList.computeIfAbsent(edge[1], x -> new ArrayList<>()).add(edge[0]);
        }

        for(int i = 0;i< n;i++){
            if(!visited[i]) {
                bfs(adjacencyList, visited, i);
                numberOfComponents++;
            }
        }

        return numberOfComponents;

    }

    private void bfs(Map<Integer,List<Integer>> adjacencyList, boolean[] visited, int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(!adjacencyList.containsKey(current))
                continue;
            for(Integer neighbour : adjacencyList.get(current)){
                if(!visited[neighbour]){
                    queue.offer(neighbour);
                }
            }
        }
    }
}
