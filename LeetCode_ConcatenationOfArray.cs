public class Solution
{
    public int[] GetConcatenation(int[] nums)
    {
        var answer = nums.ToList();
        answer.AddRange(nums.ToList());
        return answer.ToArray();
    }
}
