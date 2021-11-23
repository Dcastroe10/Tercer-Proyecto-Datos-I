/**
 * @author Andres Uriza
 * @author Daniel Castro
 * @author Ricardo Borbon
 * @author Jose Pablo Esquetini
 * 
 * This class
 */
public class Dijkstra {
    // Dijkstra's Algorithm in Java


        public static void dijkstra(int[][] graph, int source) {
            int count = graph.length;
            boolean[] visitedVertex = new boolean[count];
            int[] distance = new int[count];
            for (int i = 0; i < count; i++) {
                visitedVertex[i] = false;
                distance[i] = Integer.MAX_VALUE;
            }

            // Distance of self loop is zero
            distance[source] = 0;
            for (int i = 0; i < count; i++) {

                // Update the distance between neighbouring vertex and source vertex
                int u = findMinDistance(distance, visitedVertex);
                visitedVertex[u] = true;

                // Update all the neighbouring vertex distances
                for (int v = 0; v < count; v++) {
                    if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                        distance[v] = distance[u] + graph[u][v];
                    }
                }
            }
            for (int i = 0; i < distance.length; i++) {
                System.out.printf("Distance from %s to %s is %s%n", source, i, distance[i]);
            }

        }

        // Finding the minimum distance
        private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
            int minDistance = Integer.MAX_VALUE;
            int minDistanceVertex = -1;
            for (int i = 0; i < distance.length; i++) {
                if (!visitedVertex[i] && distance[i] < minDistance) {
                    minDistance = distance[i];
                    minDistanceVertex = i;
                }
            }
            return minDistanceVertex;
        }

        public static void main(String[] args) {
            int graph2[][] = new int[][] {
                    { 0, 0, 1, 2, 0, 0, 0 },
                    { 0, 0, 2, 0, 0, 3, 0 },
                    { 1, 2, 0, 1, 3, 0, 0 },
                    { 2, 0, 1, 0, 0, 0, 1 },
                    { 0, 0, 3, 0, 0, 2, 0 },
                    { 0, 3, 0, 0, 2, 0, 1 },
                    { 0, 0, 0, 1, 0, 1, 0 } };
            int graph[][] = new int[][]{ //PRUEBAS PARA INTENTAR ENTENDER EL ALGORITMO
                    {0,1,1,0,0},
                    {1,0,1,0,0},
                    {0,0,0,0,0},
                    {0,1,1,0,0},
                    {1,0,0,0,0}};
            Dijkstra T = new Dijkstra();
            //T.dijkstra(graph, 0);
            T.dijkstra(graph, 0);
        }
    }
