package jvm.systemproperty;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // システムプロパティの取得
        System.out.print("利用中のJavaのバージョン:");
        System.out.println(
                System.getProperty("java.version")
        );
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("システムプロパティ一覧");
        while (i.hasNext()) {
            String key = i.next();
            System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }

        // システムプロパティを利用した値の読み書き
        System.setProperty("rpg.version", "0.3");
        String ver = System.getProperty("rpg.version");
        System.out.println("RPG: スッキリ魔王討伐 ver" + ver);
    }
}
