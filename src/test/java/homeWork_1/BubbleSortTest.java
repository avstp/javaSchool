package test.java.homeWork_1;

import main.java.homeWork_1.BubbleSortForTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] array = IntStream.generate(() -> new Random().nextInt(100))
                .limit(100)
                .toArray();
        int[] sortedArray = BubbleSortForTest.sort(array);
        boolean isCorrect = IntStream.range(0, array.length - 1)
                .allMatch(i -> sortedArray[i] >= sortedArray[i+1]);
        //Assert.assertTrue(isCorrect);
    }
}
