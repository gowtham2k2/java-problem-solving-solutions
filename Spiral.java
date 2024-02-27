import java.util.ArrayList;
import java.util.List;

public class Spiral {

    List<Integer> spiralIt(int[][] a) {
        List<Integer> nums = new ArrayList<>();
        if(a == null || a.length == 0)
        return nums;

        int left = 0;
        int right = a[0].length - 1;
        int top = 0;
        int bottom = a.length - 1;
        int arrsize = a.length * a[0].length;

        while (nums.size() < arrsize) {
            for (int i = left; i <= right && nums.size() < arrsize; i++) {
                nums.add(a[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && nums.size() < arrsize; i++) {
                nums.add(a[i][right]);
            }
            right--;

            for (int i = right; i >= left && nums.size() < arrsize; i--) {
                nums.add(a[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && nums.size() < arrsize; i--) {
                nums.add(a[i][left]);
            }
            left++;
        }

        return nums;

    }
}
