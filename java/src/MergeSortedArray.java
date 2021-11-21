public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = n - 1, k = n + m - 1;
        for (int left = m - 1 ; left >= 0 && right >= 0 ; ) {
            nums1[k--] = nums1[left] > nums2[right] ? nums1[left--] : nums2[right--];
        }

        while (right >= 0) {
            nums1[k--] = nums2[right--];
        }
    }
}
