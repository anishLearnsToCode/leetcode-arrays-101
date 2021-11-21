import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] array) {
        for (int element : array) {
            if (element != 0) {
                markUsed(array, element - 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int index = 0 ; index < array.length ; index++) {
            if (array[index] != 0)
                result.add(index + 1);
        }
        return result;
    }

    private void markUsed(int[] array, int index) {
        if (array[index] == 0) return;
        int value = array[index];
        array[index] = 0;
        markUsed(array, value - 1);
    }
}
