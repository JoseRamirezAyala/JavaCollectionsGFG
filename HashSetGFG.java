import java.util.HashSet;
import java.util.Iterator;


public class HashSetGFG {
  public static void main(String[] args) {
    // Creating HashSet and
    // adding elements
    HashSet<String> hs = new HashSet<String>();

    hs.add("Geeks");
    hs.add("For");
    hs.add("Geeks");
    hs.add("Is");
    hs.add("Very helpful");

    // Traversing elements
    // Elements are returned in no particular order
    Iterator<String> itr = hs.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
