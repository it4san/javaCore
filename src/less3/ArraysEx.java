package less3;

public class ArraysEx {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[5];

        nums[4] = 100;

        int last = nums[nums.length - 1];

        System.out.println(nums.length);
        System.out.println(last);

        int[][] nums2 = {{0,2,3},{1,2,3,4,5}};
        int[][] ints2_2 = new int[2][3];

        ints2_2[1][0] = 44;

        Integer[] integers = new Integer[10];

        System.out.println();
    }
}
