import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i - 1 < value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return value > 0 ? result : BigInteger.valueOf(0);
    }
}