package textreadwrite;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // ファイルに文字情報を書き込む
        FileWriter fw = new FileWriter("rpgsave.dat", true);
        fw.write('A'); // 文字を書き込む
        // これを呼ばないと正しくデータが書き込まれない
        // JVMに対して「今まで書き込み依頼したデータで、実際には書き込んでいない
        // 部分があれば今すぐに書き出せ」と指示する
        fw.flush();
        fw.close(); // ファイルを閉じる

        // ファイルを読み込む
        FileReader fr = new FileReader("rpgsave.dat");
        System.out.println("全てのデータを読んで表示します");
        int i = fr.read(); // 1文字読む
        while (i != -1) {
            char c = (char)i;
            System.out.print(c);

            // intで返ってくることに注意
            // 末尾に到達して、これ以上読むデータがなければ-1を返したい
            // charでは-1は返せない
            i = fr.read();
        }
        System.out.println("ファイルの末尾に到達しました");
        fw.close();

        // バイナリファイルにバイト列を書き込む
        // 文字以外の情報を扱える、小さなデータ容量で済む、高速に処理できる
        FileOutputStream fos =
                new FileOutputStream("rpgsave.dat", true);
        fos.write(65); // 2進数で01000001
        fos.flush();
        fos.close();
    }
}
