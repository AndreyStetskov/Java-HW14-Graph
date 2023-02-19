import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {

       Node pointA = new Node(null, "A");
       Node pointB = new Node(null, "B");
       Node pointC = new Node(null, "C"); /* equals Б */
       Node pointD = new Node(null, "D"); /* equals Д */
       Node pointE = new Node(null, "E");
       Node pointF = new Node(null, "F"); /* equals Г */
       Node pointG = new Node(null, "G"); /* equals Ж */
       Node pointH = new Node(null, "H"); /* equals З */
       Node pointI = new Node(null, "I"); /* equals И */
       Node pointK = new Node(null, "K");

       List<Node> fromA = new ArrayList<>();
       fromA.add(pointC);
       fromA.add(pointB);
       fromA.add(pointF);
       fromA.add(pointD);
       pointA.setRib(fromA);

       List<Node> fromB = new ArrayList<>();
       fromB.add(pointG);
       pointB.setRib(fromB);

       List<Node> fromC = new ArrayList<>();
       fromC.add(pointE);
       fromC.add(pointB);
       pointC.setRib(fromC);

       List<Node> fromD = new ArrayList<>();
       fromD.add(pointF);
       fromD.add(pointI);
       pointD.setRib(fromD);

       List<Node> fromE = new ArrayList<>();
       fromE.add(pointK);
       pointE.setRib(fromE);

       List<Node> fromF = new ArrayList<>();
       fromF.add(pointB);
       fromF.add(pointH);
       pointF.setRib(fromF);

       List<Node> fromG = new ArrayList<>();
       fromG.add(pointK);
       fromG.add(pointH);
       pointG.setRib(fromG);

       List<Node> fromH = new ArrayList<>();
       fromH.add(pointK);
       pointH.setRib(fromH);

       List<Node> fromI = new ArrayList<>();
       fromI.add(pointB);
       pointI.setRib(fromI);


//       The shortest way (10): Reykjaik - Oslo - Berlin - Rome - Athens
    }
}