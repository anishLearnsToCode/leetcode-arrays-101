import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.stream(heights).sorted().toArray();
        int differences = 0;
        for (int index = 0 ; index < expected.length ; index++) {
            if (heights[index] != expected[index]) differences++;
        }
        return differences;
    }
}
