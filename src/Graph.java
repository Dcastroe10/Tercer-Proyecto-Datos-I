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

  public Graph (int size){
      vertices = new Vertices[size];
      for (int i = 0; i < size; i++){
          vertices[i] = new Vertices(size);
      }
  }


  public void agregar (String city1,int posicion1, String city2, int posicion2, int weight){
          Paths camino = new Paths( city1, posicion1,  city2,  posicion2,  weight);
          vertices[posicion1].agregar_edge(camino);
          vertices[posicion2].agregar_edge(camino);
  }
  public List<Paths> get_graph (int city){
      return vertices[city].getLista_de_paths();
  }

    public static void main(String[] args) {
        Graph grafo = new Graph(25);
        /*
        grafo.agregar("Santa Cruz", 1, "Liberia",2,99);
        grafo.agregar("Liberia", 2, "Puntarenas",3,99);
        grafo.agregar("Puntarenas", 3, "Orotina",4,99);
        grafo.agregar("Puntarenas", 3, "Parrita",15,99);
        grafo.agregar("Orotina", 4, "Palmares",5,99);
        grafo.agregar("Palmares", 5, "Ciudad Quesada",6,99);
        grafo.agregar("Ciudad Quesada", 6, "Fortuna",7,99);
        grafo.agregar("Palmares", 5, "Alajuela",8,99999);
        grafo.agregar("Alajuela", 8, "Heredia",9,99);
        grafo.agregar("Alajuela", 8, "San José",10,99);
        grafo.agregar("Heredia", 9, "San José",10,99);
        grafo.agregar("San José", 10, "Escazú",11,99);
        grafo.agregar("Escazú", 11, "Cartago",12,99);
        grafo.agregar("Cartago", 12, "Turrialba",13,99);
        grafo.agregar("Turrialba", 13, "Limón",14,99);

         */

        //__________________________________________________________________________________________
        grafo.agregar("Santa Cruz", 1, "Orotina",4,99);
        grafo.agregar("Liberia", 2, "Upala",7,99);
        grafo.agregar("Upala", 7, "Ciudad Quesada",6,99);
        grafo.agregar("Ciudad Quesada", 6, "Palmares",5,99);
        grafo.agregar("Orotina", 4, "Palmares",5,99);
        grafo.agregar("Palmares", 5, "Escazú",11,99);
        grafo.agregar("Escazú", 11, "San José",10,99);
        grafo.agregar("San José", 10, "Alajuela",8,99);
        grafo.agregar("San José", 10, "Parrita",15,99);
        grafo.agregar("Alajuela", 8, "Heredia",9,99);
        grafo.agregar("Heredia", 9, "Cartago",12,99);
        grafo.agregar("Heredia", 9, "Turrialba",13,99);
        grafo.agregar("Turrialba", 13, "Limón",14,99);
        grafo.agregar("Cartago", 12, "Puntarena???",3,99);//!!!!!!!!!!!!!!!
        grafo.agregar("Parrita", 15, "Puntarena???",    3,99);








        int ciudad = 16;
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
    }

}