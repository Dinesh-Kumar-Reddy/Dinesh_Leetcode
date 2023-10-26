package A_LeetCode.A_1_TwoSum;

public class TwoSumWithForLoop
{
    private static int[] twoSum(int[] numbs, int target)
    {
        for(int i=0;i<numbs.length;i++)
        {
            for(int j=i+1;j<numbs.length;j++)
            {
                if(numbs[i]+numbs[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return numbs;
    }

    public static void main(String[] args)
    {
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbs,target);
        //System.out.println("Indices/Indexes of two numbers : "+"["+result[0]+","+result[1]+"]");
        System.out.println("Indices/Indexes of two numbers : ["+result[0]+","+result[1]+"]");
    }
}
