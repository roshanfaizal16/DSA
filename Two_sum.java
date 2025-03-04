import java.util.Arrays;

class Two_sum {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = arr[i]; 
            nums[i][1] = i;      
        }

       Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = nums[left][0] + nums[right][0];
            if (sum == target) {
                return new int[]{nums[left][1], nums[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Two_sum solution = new Two_sum();
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
