public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] array) {
        if(array.length == 0) return 0;
        int finalLength = 1;
        for (int index = 1, current = array[0] ; index < array.length ; index++) {
            if (array[index] != current) {
                array[finalLength] = array[index];
                finalLength++;
                current = array[index];
            }
        }
        return finalLength;
    }
}
