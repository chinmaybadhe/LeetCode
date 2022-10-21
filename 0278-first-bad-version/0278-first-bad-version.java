/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start=0;
        int end=n;
        if(isBadVersion(0)) return 0;
        int mid=0;
        
        while(true){
            mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                if(isBadVersion(mid) && !isBadVersion(mid-1)){
                    return mid;
                    
                }
                end=mid-1;
                
            }else{
                start=mid+1;
                
            }
            
            
        }
        
        
 
    }
}