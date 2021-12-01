import java.util.List;

/**
 * @author Andres Uriza
 * @author Daniel Castro
 * @author Ricardo Borbon
 * @author Jose Pablo Esquetini
 * 
 * This class creates the graph that represent the map
 * 
 */
public class Graph {
  public Vertices[] vertices;
  public int size = 0;

  public Graph (int size){
      this.size = size;
      vertices = new Vertices[size];
      for (int i = 0; i < size; i++){
          vertices[i] = new Vertices(size);
      }
  }

  public int getSize() {
      return this.size;
  }


  public void agregar (String city1,int posicion1, String city2, int posicion2, double distance){
          Paths camino = new Paths( city1, posicion1,  city2,  posicion2,  distance);
          vertices[posicion1].agregar_edge(camino);
          vertices[posicion2].agregar_edge(camino);
  }
  public List<Paths> get_graph (int city){
      return vertices[city].getLista_de_paths();
  }

  public int[][] createGraph() {
    int[][] newGrafo = new int[size][size];

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            newGrafo[i][j] = 0;
        }
    }
    
    for (int i = 0; i < size; i++) {
        List<Paths> pathList = this.get_graph(i);

        for (Paths path:pathList) {
            if (path.getCity1_index() == i){
                newGrafo[path.getCity1_index()][path.getCity2_index()] = path.getWeight();
                //System.out.println(path.getWeight());
            }
            if (path.getCity2_index() == i) {
                newGrafo[path.getCity2_index()][path.getCity1_index()] = path.getWeight();
                //System.out.println(path.getWeight());
            }
        }
    }

    return newGrafo;
  }

  public int dijkstra(int[][] graph, int city1, int city2) {
    int count = graph.length;
    boolean[] visitedVertex = new boolean[count];
    int[] distance = new int[count];
    for (int i = 0; i < count; i++) {
        visitedVertex[i] = false;
        distance[i] = Integer.MAX_VALUE;
    }

    distance[city1] = 0;

    for (int i = 0; i < count; i++) {

        int u = findMinDistance(distance, visitedVertex);
        visitedVertex[u] = true;

        for (int v = 0; v < count; v++) {
            if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                distance[v] = distance[u] + graph[u][v];
            }
        }
    }

    return distance[city2];
}

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
}