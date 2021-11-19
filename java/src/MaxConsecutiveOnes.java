public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] array) {
        int result = 0, current = 0;
        for (int element : array) {
            if (element == 1) {
                current++;
                result = Math.max(result, current);
            } else {
                current = 0;
            }
        }
        return result;
    }
}
