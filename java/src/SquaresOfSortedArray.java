public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] array) {
        int[] result = new int[array.length];
        int left = 0, right = array.length - 1, k = right;
        while (left <= right) {
            if (Math.abs(array[left]) < Math.abs(array[right])) {
                result[k--] = array[right] * array[right--];
            } else {
                result[k--] = array[left] * array[left++];
            }
        }
        return result;
    }
}
