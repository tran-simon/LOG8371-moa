package moa.classifiers;

public final class Sorter {
  public static int[] bubbleSort(int[] values) {

    int[] result = values.clone();
    boolean sorted;

    do {
      sorted = true;
      for (int i = 1; (i < values.length); i++) {
        int value1 = result[i - 1];
        int value2 = result[i];

        if (value2 < value1) {
          result[i - 1] = value2;
          result[i] = value1;
          sorted = false;
        }
      }
    } while (!sorted);

    return result;
  }
}

