package jvm.reflection;

import java.lang.reflect.*;

// リフレクションAPIが必要となるケース
// テストや解析のため、privateメンバを操作したい場合
// メンバ名を用いた特殊な処理を作りこみたい場合
// 利用するクラスを動的に追加・変更できるようにしたい場合
public class Main {
    public static void main(String[] args) throws Exception {
        // Stringの型情報を取得して表示する
        Class<?> info1 = String.class; // Classクラスインスタンスの基本的な取得方法
        System.out.println(info1.getSimpleName()); // => String
        System.out.println(info1.getName()); // => java.lang.String
        System.out.println(info1.getPackage().getName()); // => java.lang
        System.out.println(info1.isArray()); // => false

        // Stringの親クラスの情報を取得する
        Class<?> info2 = info1.getSuperclass();
        System.out.println(info2.getName()); // => java.lang.Object

        // 引数1つのコンストラクタを取得し、インスタンスを生成する
        Class<?> clazz = RefSample.class;
        Constructor<?> cons = clazz.getConstructor(int.class);
        RefSample rs = (RefSample)cons.newInstance(256);

        // timesフィールドに関するFieldを取得して読み書き
        Field f = clazz.getField("times");
        f.set(rs, 2); // rsのtimesに代入
        System.out.println(f.get(rs)); // rsのtimesを取得

        // 引数2つのhelloメソッドを取得して呼び出す
        Method m = clazz.getMethod("hello", String.class, int.class);
        m.invoke(rs, "reflection!", 128);

        // クラスやメソッドへの修飾(publicやfinalの有無)を調べる
        boolean pubc = Modifier.isPublic(clazz.getModifiers());
        boolean finm = Modifier.isFinal(m.getModifiers());
    }
}
