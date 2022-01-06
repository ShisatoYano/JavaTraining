package internet;

import java.net.URL;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://book.impress.co.jp/");
        InputStream is = u.openStream(); // インターネットへ接続
        int i = is.read();
        while (i != -1) {
            char c = (char)i;
            System.out.print(c);
            i = is.read();
        }
    }
}
