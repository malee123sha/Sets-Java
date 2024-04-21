import java.util.TreeSet;
public class SortTree {
    public static void main(String[] args) {
        TreeSet <String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        System.out.println("TreeSet :- "+ts);
        System.out.println("--------------------------------");
        System.out.println("Reverse TreeSet :- "+ts.descendingSet());
        System.out.println("--------------------------------");
        System.out.println("Top TreeSet :- "+ts.headSet("C",true));
        System.out.println("Top TreeSet :- "+ts.headSet("C",false));
        System.out.println("--------------------------------");
        System.out.println("Remove TreeSet :- "+ts.subSet("A",false,"E",true));
        System.out.println("Remove TreeSet :- "+ts.subSet("A",true,"E",false));
        System.out.println("--------------------------------");
        System.out.println("Bottom TreeSet :- "+ts.tailSet("C",false));
        System.out.println("Bottom TreeSet :- "+ts.tailSet("C",true));
    }
}
