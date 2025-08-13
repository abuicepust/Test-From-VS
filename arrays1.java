public class arrays1 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int i=0;
        while (nums.length>i) {
            System.out.print(nums[i]+" ");
            i++;
        }
        System.out.println();

        for (int j : nums) {
           System.out.print(nums[j-1]+" "); 
        }
        System.out.println();
        for(int k=0;k<=nums.length-1;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
