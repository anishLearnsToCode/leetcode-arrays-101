public class SortArrayByParity {
    public int[] sortArrayByParity(int[] array) {
        int[] result = new int[array.length];
        for (int left = 0, right = array.length - 1, index = 0 ; index < array.length ; index++) {
            if (array[index] % 2 == 0) {
                result[left++] = array[index];
            } else {
                result[right--] = array[index];
            }
        }
        return result;
    }
}
