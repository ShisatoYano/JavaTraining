package socket;

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Socketを用いてWebページを取得する
        Socket sock = new Socket("dokojava.jp", 80);
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        os.write("GET /index.html HTTP/1.0\n".getBytes()); // HTTP要求を送信
        os.write("\r\n".getBytes());
        os.flush();
        // 応答の受信
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while (i != -1) {
            System.out.print((char)i);
            i = is.read();
        }
        sock.close();
    }
}
