package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Minato", 75, 18);
        // インスタンスの直列化と保存
        FileOutputStream fos =
                new FileOutputStream("rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1); // インスタンス => バイト列
        oos.flush();
        oos.close();
        // ファイルからインスタンスを復元
        FileInputStream fis = new FileInputStream("rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero)ois.readObject(); // バイト列 => インスタンス
        ois.close();
    }
}
