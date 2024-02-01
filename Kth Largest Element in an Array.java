Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

// 1st Approach using sorting

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-k];
    }
}

// 2nd Approach using Heap Data Structure

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        // Add upto k elements of array to Min Heap
        for(int i=0;i<k;i++){
            minHeap.add(nums[i]);
        }
        // For Remaining elements in array (k to end of array)
        // if current element is larger than the top of heap(smallest element in heap)
        for(int i=k;i<nums.length;i++){
            
            if(nums[i]>minHeap.peek()){
                // remove the top element and insert the current element into heap
                minHeap.poll();  
                minHeap.add(nums[i]);
                //(the heap Data Structure in your language will take care of rules of min heap)
            }
        }
        // after processing all the elements in array, the top will be the k th largest element.
        return minHeap.peek();
    }
}
