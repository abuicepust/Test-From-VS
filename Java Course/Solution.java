
class Solution {
    public static void main(String[] args) {
        //String[] cars = {"Abu","Masud","Didar"};
        int[] num = {1,1,3,5};
        int result = removeDuplicates(num);
        System.out.println(result);

        //Arrays.asList(num);
        //int result = removeDuplicates(num);
        //System.out.println(Arrays.asList(cars));
        // for(String i : cars){
        //     System.out.println(i);
        // }
    }
    public static int removeDuplicates(int[] nums) {
        int ind = 1; 
        for(int i=0;i<nums.length-1;i++){
            if (nums[i] != nums[i+1]) {
                nums[ind++] = nums[i];
            }
        }
        

        return ind;
    }
}