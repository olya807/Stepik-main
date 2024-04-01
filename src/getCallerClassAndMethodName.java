public class getCallerClassAndMethodName {
    public static String getCallerClassAndMethodName() {
        if (Thread.currentThread().getStackTrace().length > 3) {
            return Thread.currentThread().getStackTrace()[3].getClassName() + "#" + Thread.currentThread().getStackTrace()[3].getMethodName();
        }
        return null;
    }
}