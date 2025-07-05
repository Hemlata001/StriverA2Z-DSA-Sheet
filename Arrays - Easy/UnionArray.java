class UnionArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
         for(int i = 0; i<nums2.length;i++){
            set.add(nums2[i]);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    
    }
}
