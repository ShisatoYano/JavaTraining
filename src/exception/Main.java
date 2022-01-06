package exception;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt");) {
            fw.write("hello");
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        Person p = new Person();
        p.setAge(127);

        try {
            // 試験的に例外を発生させる
            throw new UnsupportedMusicFileExecption
                    ("未対応のファイルです");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
