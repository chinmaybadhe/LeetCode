class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int totalLength=(nums1.length+nums2.length);
        
        boolean takeSum=totalLength%2==0;
        totalLength=totalLength/2;
        int i=0;
        int n1=0;
        int n2=0;
        
        int mergedArr[]=new int[totalLength+1];
        
        while(i<=totalLength && n1<nums1.length && n2<nums2.length)
        {
           if(nums1[n1]>nums2[n2]){
               mergedArr[i]=nums2[n2];
               n2++;
               
           }else{
                mergedArr[i]=nums1[n1];
                n1++;
                
            }
            i++;
        }
        
        while(n1<nums1.length && i<totalLength+1){
            mergedArr[i]=nums1[n1];
            i++;
            n1++;
                
        }
        while(n2<nums2.length && i<totalLength+1){
            mergedArr[i]=nums2[n2];
            i++;
            n2++;
  
        }
        float median=mergedArr[totalLength];
        if(takeSum){
            median=(median+mergedArr[totalLength-1])/2f;
            
        }
        

        
        
        return median;

        
       
    }
}