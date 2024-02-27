import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        twoSum(arr, n);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j + i < nums.length; j++) {
                if (nums[j + i] + nums[j] == target) {
                    return new int[] { j, j + i };
                }
            }
        }

        return new int[] {};
    }

}
