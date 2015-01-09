import java.util.List;
import java.util.ArrayList;
import java.lang.String;

public class Permutations {
  public static List<String> permutations(String str) {
    List<String> result = new ArrayList<String>();
    if (str.length() == 0) {
      return result;
    }

    for (int i = 0; i < str.length(); i++) {
      String x = str.substring(i, i + 1);
      String before = str.substring(0, i);
      List<String> otherPerms;
      if (i < str.length() - 1) {
        String after = str.substring(i + 1, str.length());
        otherPerms = permutations(before + after);
      } else {
        otherPerms = permutations(before);
      }

      for (String p : otherPerms) {
        result.add(x + p);
      }
    }
    return result;
  }

  public static void main(String... args) {
    List<String> permutations = permutations("hello");
    for (String p : permutations) {
      System.out.println(p);
    }
  }
}
