package A_LeetCode.A_1_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithMap
{

    private static int[] twoSum(int[] numbs, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<numbs.length ; i++)
        {
            map.put(numbs[i], i);
        }

        for(int i=0 ; i<numbs.length ; i++)
        {
            int num = target - numbs[i];

            if(map.containsKey(num))
            {
                int index = map.get(num);
                return new int[] {i, index};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args)
    {
         int[] numbs = {2, 7, 11, 15};
         int target = 9;

         int[] result = twoSum(numbs, target);
         System.out.print("Indices/Indexes of two numbers : ["+result[0]+","+result[1]+"]");
    }
}
