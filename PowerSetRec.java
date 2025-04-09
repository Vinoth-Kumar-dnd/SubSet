package package1;

import java.util.ArrayList;
import java.util.List;

public class PowerSetRec {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = { 1, 2, 3 };

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> answer = new ArrayList<>();

        helper(nums, 0, result, answer);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

    }

    private static void helper(int[] nums, int idx, List<List<Integer>> result, List<Integer> answer) {

        if (idx == nums.length) {
            result.add(new ArrayList<>(answer));
            return;
        }

        answer.add(nums[idx]);
        helper(nums, idx + 1, result, answer);

        answer.remove(answer.size() - 1);
        helper(nums, idx + 1, result, answer);

    }

}
