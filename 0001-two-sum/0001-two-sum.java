class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put( target-arr[i],i);
            }
            else{
                    return new int[]{i,hm.get(arr[i])};
            }

        }
        
        return new int[]{0,arr[0]};
        
    }
}