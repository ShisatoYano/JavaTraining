package fileexception;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // ファイルを確実に閉じるための例外処理
        // tryブロックの外で宣言し、nullで初期化しないと
        // finallyブロック内でclose()できない
        FileWriter fw = null;
        try {
            fw = new FileWriter("rpgsave.dat", true);
            fw.write('B');
            fw.flush();
        } catch (IOException e) {
            System.out.println("ファイル書き込みエラーです");
        } finally { // ファイルを閉じるためのfinallyブロック
            if (fw != null) {
                // close()がIOExceptionを出す可能性があるため、
                // 再度try-catchが必要
                // ただし失敗しても何もできないため
                // catchブロック内は空にしている
                try {
                    fw.close();
                } catch (IOException e2) {
                    // do nothing
                }
            }
        }
    }
}
