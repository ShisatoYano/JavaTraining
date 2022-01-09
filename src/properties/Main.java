package properties;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // プロパティファイルの読み取り
        Reader fr = new FileReader("rpgdata.properties");
        Properties p = new Properties();
        p.load(fr); // ファイル内容を読み取る
        String name = p.getProperty("heroName"); // キーを指定して値を取り出す
        String strHp = p.getProperty("heroHp");
        int hp = Integer.parseInt(strHp);
        System.out.println("Hero's name:" + name);
        System.out.println("Hero's HP:" + hp);
        fr.close();

        // プロパティファイルへの書き込み
        Writer fw = new FileWriter("rpgsave.properties");
        Properties pw = new Properties();
        // データのセット
        p.setProperty("heroName", "Asaka");
        p.setProperty("heroHp", "62");
        p.setProperty("heroMp", "45");
        // ファイルへ書き出し
        // ファイルの先頭にコメントとして出力される
        p.store(fw, "Hero's info");
        fw.close();

        // ResourceBundleを用いたファイルの読み取り
        ResourceBundle rb = ResourceBundle.getBundle(
                "jp.miyabilink.rpg.rpgdata");
        String heroName = rb.getString("heroName");
        System.out.println("Hero's name:" + heroName);
    }
}
