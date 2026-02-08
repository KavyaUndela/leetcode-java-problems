class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer>set1=new HashSet<>();
      HashSet<Integer>result=new HashSet<>();
      for(int i=0;i<nums1.length;i++){
        set1.add(nums1[i]);
      }
      for(int i=0;i<nums2.length;i++){
        if(set1.contains(nums2[i])){
            result.add(nums2[i]);
        }
      }
      int[] results=new int[result.size()];
      int index=0;
      for(int num:result){
        results[index]=num;
        index++;
      }
      return results;  
    }
}