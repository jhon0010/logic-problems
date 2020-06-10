package practice.problems;

public class SearchInsertPosition {

    public static void main(String[] args) {

        var nums = new int[] {1};
        var target = 2;

        System.out.println(searchInsert(nums, target));

    }

    /**
     * This exercise require to keep the track of the index
     * and the index could be declare outside the for loop
     */
    public static int searchInsert(int[] nums, int target) {

        int i=0;
        for(; i <= nums.length -1; i++) {
            if(nums[i] >= target) return i;
        }
        return i;
    }

}
