public class ThirdMaximumNumber {
    public static int thirdMax(int[] array) {
        if (array.length == 1) return array[0];
        if (array.length == 2) return Math.max(array[0], array[1]);
        long max = array[0], secondMax = Long.MIN_VALUE, thirdMax = Long.MIN_VALUE;
        for (int index = 1 ; index < array.length ; index++) {
            if (array[index] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = array[index];
            } else if (array[index] > secondMax && array[index] < max) {
                thirdMax = secondMax;
                secondMax = array[index];
            } else if (array[index] > thirdMax&& array[index] < secondMax) {
                thirdMax = array[index];
            }
        }
        return (int) (thirdMax == Long.MIN_VALUE ? max : thirdMax);
    }
}
