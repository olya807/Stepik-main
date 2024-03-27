public class leapYearCount {
    public static int leapYearCount(int year) {
        int k4;
        int k100;
        int k400;
        k4 = year / 4;
        k100 = year / 100;
        k400 = year / 400;

        return k4 - k100 + k400;
    }
}