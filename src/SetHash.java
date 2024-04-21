import java.util.HashSet;
import java.util.Iterator;
public class SetHash {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");
        Iterator <String> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
