/**
 * @author Andres Uriza
 * @author Daniel Castro
 * @author Ricardo Borbon
 * @author Jose Pablo Esquetini
 * 
 * This class executes the Interfaz class
 */
public class Main {
    public static void main(String[] args) {
        Graph grafo = new Graph(15);

        String[] cities = {"San Jose", "Alajuela", "Cartago", "Heredia", "Escazu", "Quesada", "Parrita", "Turrialba", "Limon", "Orotina", "Palmares", "Puntarenas", "Santa Cruz", "Liberia", "Upala"};

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

        Interfaz aplicacion = new Interfaz(grafo, cities);
    }
}
