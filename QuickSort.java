import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class QuickSort {
  public static List<Integer> sort(List<Integer> list) {
    List<Integer> a       = new ArrayList<Integer>();
    List<Integer> b       = new ArrayList<Integer>();
    List<Integer> result  = new ArrayList<Integer>();

    if (list.isEmpty()) {
      return result;
    }

    Random r = new Random();
    int p_idx = r.nextInt(list.size());
    int pivot = list.get(p_idx);

    for (Integer i : list) {
      if (i < pivot) {
        a.add(i);
      } else if (i > pivot) {
        b.add(i);
      } // else do nothing, because i == pivot
    }

    result.addAll (sort(a));
    result.add    (pivot);
    result.addAll (sort(b));

    return result;
  }

  public static void main(String... args) {
    List<Integer> unsorted = new ArrayList<Integer>();
    unsorted.add(5);
    unsorted.add(2);
    unsorted.add(1);
    unsorted.add(8);
    unsorted.add(6);
    unsorted.add(4);

    System.out.println(unsorted);
    List<Integer> sorted = sort(unsorted);
    System.out.println(sorted);
  }
}