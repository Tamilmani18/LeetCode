/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/

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
