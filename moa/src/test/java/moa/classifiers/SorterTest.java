package moa.classifiers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SorterTest {

  @Test
  public void testBubbleSort() {
    int[] values = { 1, 3, 2, 5, 5, 4, 10, -1, 0, -3, 9 };


    int[] res = Sorter.bubbleSort(values);

    int[] expected = { -3, -1, 0, 1, 2, 3, 4, 5, 5, 9, 10 };
    assertArrayEquals(expected, res);
  }

  @Test
  public void testBubbleSort_emptyArray() {
    int[] values = {};
    int[] res = Sorter.bubbleSort(values);

    int[] expected = {};

    assertArrayEquals(expected, res);
  }

  @Test
  public void testBubbleSort_sortedArray() {
    int[] values = {1, 2, 3};
    int[] res = Sorter.bubbleSort(values);

    int[] expected = {1, 2, 3};

    assertArrayEquals(expected, res);
  }
}
