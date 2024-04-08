import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class inTest {
    public static void main(String[] args) throws Exception{
        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});

        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));

    }    public static String readAsString(InputStream inputStream, Charset charset) throws Exception {
        return "";

    }
}