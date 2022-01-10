package serialization;

import java.io.*;

// 直列化されるクラスは、java.io.Serializableを実装する必要がある
// メソッドのオーバーライドなどは行う必要はない
public class Hero implements Serializable {
    private String name;
    private int hp;
    private int mp;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp   = hp;
        this.mp   = mp;
    }
}
