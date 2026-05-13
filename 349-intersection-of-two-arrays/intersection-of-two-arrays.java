class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0,p2=0;
        while(p1 < nums1.length && p2 < nums2.length)
        {
           if(nums1[p1] == nums2[p2])
           {
                nums.add(nums1[p1]);
                p1++;
                p2++;
           } 
           else if(nums1[p1] < nums2[p2])
           {
                p1++;
           }   
           else
           {
                p2++;
           }              
        }
        for (int i = 0; i < nums.size(); i++) {
            set.add(nums.get(i)); 
        }
        int[] arr = new int[set.size()];

        int i = 0;
        for (int val : set) {
            arr[i++] = val;
        }
        return arr;
    }
}