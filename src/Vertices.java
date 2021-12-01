import java.util.ArrayList;
import java.util.List;

/**
 * @author Andres Uriza
 * @author Daniel Castro
 * @author Ricardo Borbon
 * @author Jose Pablo Esquetini
 *
 * This class creates the nodes that form the graph
 * 
 */
public class Vertices {
    private  int identificador;
    private List<Paths> lista_paths = new ArrayList<>();

    public Vertices (int id){
        identificador=id;
    }

    public  void agregar_edge(Paths path){
        lista_paths.add(path);
    }

    public int getIdentificador() {
        return identificador;
    }

    public List<Paths> getLista_de_paths() {
        return lista_paths;
    }
}
