public class Paths {

    public String city1;
    public int city1_index;
    public String city2;
    public int city2_index;
    public int weight;

    public Paths(String city1,int posicion1, String city2, int posicion2, int weight) {
        this.city1 = city1;
        this.city1_index = posicion1;
        this.city2 = city2;
        this.city2_index = posicion2;
        this.weight = weight;
    }

    public String decode_city (int index){
        if (index == city1_index){
            return city1;
        }else{
            return city2;
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getCity1() {
        return city1;
    }

    public int getCity1_index() {
        return city1_index;
    }

    public String getCity2() {
        return city2;
    }

    public int getCity2_index() {
        return city2_index;
    }
}
