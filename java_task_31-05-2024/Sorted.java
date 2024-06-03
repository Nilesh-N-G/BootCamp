public class Sorted {
    public static boolean isSorted(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5})); 
        System.out.println(isSorted(new int[]{7, 8, 9, 10, 1, 2, 3, 4, 5})); 
        System.out.println(isSorted(new int[]{3, 1, 2, 4, 5})); 
    }
}
