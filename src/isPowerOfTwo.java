public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        return value != 0 && (value < 0 ? (-value & (-value - 1)) == 0 : (value & (value - 1)) == 0);
    }
}