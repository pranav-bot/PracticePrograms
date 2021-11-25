import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 55};
        change(arr);
    }
static void change(int[] nums){
        nums[0]=99;
    System.out.println(Arrays.toString(nums));
}
}

