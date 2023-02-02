import java.time.LocalDate;

class Solution {
    public static int dayOfYear(String date) {
        var nums = Arrays.stream(date.split("-")).map(e -> Integer.parseInt(e)).toList();
        var getDate = LocalDate.of(nums.get(0), nums.get(1), nums.get(2));
        var ans = getDate.getDayOfYear();
        return ans;
    }
}
