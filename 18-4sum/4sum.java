class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        int i = 0;
        while (i < n - 3) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int j = i + 1;
            while (j < n - 2) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }

                int l = j + 1;
                int k = n - 1;

                while (l < k) {

                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];

                    if (sum < target) {
                        l++;
                    } else if (sum > target) {
                        k--;
                    } else {

                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));

                        l++;
                        k--;

                        while (l < k && nums[l] == nums[l - 1]) l++;
                        while (l < k && nums[k] == nums[k + 1]) k--;
                    }
                }

                j++;
            }

            i++;
        }

        return ans;
    }
}