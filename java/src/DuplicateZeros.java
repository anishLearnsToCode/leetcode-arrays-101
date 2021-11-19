public class DuplicateZeros {
    public static void duplicateZeros(int[] array) {
        int removals = 0, k = array.length - 1;
        for (int i = 0 ; i < array.length - removals ; i++) {
            if (array[i] == 0) {
                if (i == array.length - removals - 1) {
                    array[k--] = 0;
                }
                removals++;
            }
        }
        for (int index = array.length - removals - 1 ; index >= 0 ; index--, k--) {
            if (array[index] == 0) {
                array[k] = array[k - 1] = 0;
                k--;
            } else {
                array[k] = array[index];
            }
        }
    }
}
