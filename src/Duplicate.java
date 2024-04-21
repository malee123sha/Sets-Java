import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        hs.add("A");
        hs.add("K");
        hs.add("A");
        hs.add("S");
        hs.add("N");
        System.out.println(hs);
    }
}
