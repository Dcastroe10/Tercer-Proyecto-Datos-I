import java.util.List;

/**
 * @author Andres Uriza
 * @author Daniel Castro
 * @author Ricardo Borbon
 * @author Jose Pablo Esquetini
 * 
 * This class
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

    /**
    for (int i = 0; i < distance.length; i++) {
        System.out.printf("Distance from %s to %s is %s%n", city1, i, distance[i]);
    }
    **/

    //System.out.println("Toma " + distance[city2] + " minutos para ir de " + city1 + " a " + city2);

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

    public static void main(String[] args) {
        Graph grafo = new Graph(15);
        
        /**
         * 0) San Jose
         * 1) Alajuela
         * 2) Cartago
         * 3) Heredia
         * 4) Escazu
         * 5) Quesada
         * 6) Parrita
         * 7) Turrialba
         * 8) Limon
         * 9) Orotina
         * 10) Palmares
         * 11) Puntarenas
         * 12) Santa Cruz
         * 13) Liberia
         * 14) Upala
         */

        grafo.agregar("San Jose", 0, "Alajuela", 1, 20.6);
        grafo.agregar("San Jose", 0, "Parrita", 6, 140);
        grafo.agregar("Alajuela", 1, "Heredia", 3, 12.8);
        grafo.agregar("Alajuela", 1, "Quesada", 5, 77.4);
        grafo.agregar("Cartago", 2, "Heredia", 3, 39.0);
        grafo.agregar("Cartago", 2, "Turrialba", 7, 41.0);
        grafo.agregar("Heredia", 3, "Limon", 8, 179.0);
        grafo.agregar("Escazu", 4, "Palmares", 10, 52.7);
        grafo.agregar("Quesada", 5, "Palmares", 10, 52.3);
        grafo.agregar("Quesada", 5, "Upala", 14, 143.0);
        grafo.agregar("Turrialba", 7, "Limon", 8, 106.0);
        grafo.agregar("Orotina", 9, "Palmares", 10, 40.9);
        grafo.agregar("Orotina", 9, "Puntarenas", 11, 42.2);
        grafo.agregar("Puntarenas", 11, "Santa Cruz", 12, 148.0);
        grafo.agregar("Santa Cruz", 12, "Liberia", 13, 57.9);
        grafo.agregar("Liberia", 13, "Upala", 14, 105.0);

        int[][] newGraph = grafo.createGraph();
        //grafo.dijkstra(newGraph, 0, 6);

        /**
        int ciudad = 14;
        List<Paths> lista = grafo.get_graph(ciudad);
        for (Paths camino:lista){
            if (camino.getCity1_index() == ciudad){
                System.out.println("Sale de " + camino.decode_city(ciudad) + " llega a " +camino.getCity2() +
                        " y el peso es = "+ String.valueOf(camino.getWeight()));

            }else{
                System.out.println("Sale de " + camino.getCity2() + " llega a " +camino.getCity1() +
                        " y el peso es = "+ String.valueOf(camino.getWeight()));
            }

        }
        

        
        int i = 0;
        int j = 0;
        //int[][] newGraph = grafo.createGraph();

        while (i  < 15) {
            while (j < 15) {
                System.out.println(newGraph[i][j]);
                j++;
            }
            j = 0;
            i++;
        }
        **/
        
    }

}