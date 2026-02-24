public class Leetcode_852 {
    class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length-1;
        if(n==0){
            return 0;
        }else if(arr[n]>arr[n-1]){
            return n;
        }else if(arr[0]>arr[1]){
            return 0;
        }
        int low=1;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
}
