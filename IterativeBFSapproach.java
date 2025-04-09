package package1;

import java.util.ArrayList;
import java.util.List;

public class IterativeBFSapproach {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = { 1, 2, 3 };

        List<List<Integer>> result = helper(nums);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

    }

    public static List<List<Integer>> helper(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {

            int size = result.size();

            for (int j = 0; j < size; j++) {

                List<Integer> answer = new ArrayList<>(result.get(j));
                answer.add(nums[i]);
                result.add(answer);
            }
        }
        return result;

    }
}
