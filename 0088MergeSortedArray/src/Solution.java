/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0088
 * @Author BaiMohan
 * @Date 2021/4/6 21:54
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1;
        int cur=m+n-1;
        while(p1>=0&&p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[cur]=nums1[p1];
                p1--;
            }else{
                nums1[cur]=nums2[p2];
                p2--;
            }
            cur--;
        }
        while(p1>=0){
            nums1[cur]=nums1[p1];
            p1--;
            cur--;
        }
        while(p2>=0){
            nums1[cur]=nums2[p2];
            p2--;
            cur--;
        }
    }
}
