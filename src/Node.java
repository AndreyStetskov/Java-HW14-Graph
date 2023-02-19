import java.util.List;

public class Node {
    private List<Node> rib;
    String value;


    public Node(List<Node> rib, String value) {
        this.rib = rib;
        this.value = value;
    }


    public List<Node> getRib() {
        return rib;
    }

    public void setRib(List<Node> rib) {
        this.rib = rib;
    }
}
