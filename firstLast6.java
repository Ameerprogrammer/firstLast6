//Ameer Ahmed
public class Program {
    public void firstLast6(int[] nums) {
        //loop through array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        //empty array logic
        if (nums.length == 0) {
            System.out.println("The array is empty!");
        }
            //define the first index and the last index and check them
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                boolean b1 = true;
                System.out.println("The result is: " + b1);
            }
            else {
                boolean b2 = false;
                System.out.println("The result is: " + b2);
            }
    }
        public static void main (String[]args){
            /*pass by reference for object, create a new one because our
            method is NOT static */
            Program p1 = new Program();
            int [] nums = {6,1,5};
            p1.firstLast6(nums);
        }
    }