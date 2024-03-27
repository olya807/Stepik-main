public class booleanExpression {
    public booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int s = 0;
        if (a) s++;
        if (b) s++;
        if (c) s++;
        if (d) s++;

        return s == 2 ? true : false;
    }
}
