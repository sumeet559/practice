import java.util.*;
public class Solution1 {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[100000];
        for(int i=0;i<arr.length;i++)
        arr[i] = 0;
        int j=0;
        for(j=0;j<nums.length;j++){
            if(arr[nums[j]]==1){break;}
            else arr[nums[j]]=1;
        }
        return nums[j];
    }
}
