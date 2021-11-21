public class MoveZeros {
    public void moveZeroes(int[] array) {
        int j = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] != 0) {
                array[j++] = array[i];
            }
        }
        while (j < array.length) {
            array[j++] = 0;
        }
    }
}
