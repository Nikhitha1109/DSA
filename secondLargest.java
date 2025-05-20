class Solution {
    public static int secondLargestElement(int[] nums) {
    int max = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            secondlargest=max;
            max=nums[i];
        }
        else  if (nums[i] < max && nums[i] > secondlargest) {
                secondlargest = nums[i];
            }
    }
    if (secondlargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondlargest;
        }
    }
    
public static void main(String[] args){
        int[] nums1 = {8, 8, 7, 6, 5};
        int[] nums2 = {10, 10, 10, 10};
        int[] nums3 = {7, 7, 2, 2, 10, 10};

        System.out.println(secondLargestElement(nums1));
        System.out.println(secondLargestElement(nums2));
        System.out.println(secondLargestElement(nums3)); 
    }
    }
