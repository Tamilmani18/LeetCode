class Solution {
    
    static void swap(int[] arr,int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int i=0;

        while(i<=right){
            if(nums[i]==0){
                swap(nums,i,left);
                left++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums,i,right);
                right--;
            }
            else{
                i++;
            }
        } 
    }
}