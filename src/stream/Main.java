package stream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 文字列型の変数から1文字ずつ読み取る
        String msg = "第1土曜日は資源ごみの回収です";
        Reader sr = new StringReader(msg);
        System.out.print((char)sr.read());
        System.out.print((char)sr.read());
        System.out.print((char)sr.read());

        // バイト配列に値を書き込む
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(65);
        byte[] data = baos.toByteArray(); // byte型配列に変換
        for (byte b : data) {
            System.out.println(b);
        }
    }
}
