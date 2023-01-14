import java.time.LocalDate;

class Solution {
    public static String dayOfTheWeek(int day, int month, int year) {
        String weekDay = LocalDate.of(year, month, day).getDayOfWeek().toString();
        String ans = weekDay.substring(0,1).toUpperCase() + weekDay.substring(1,weekDay.length()).toLowerCase();
        return ans;
    }
}
