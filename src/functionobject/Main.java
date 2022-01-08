package functionobject;

import instance.equals.Account;
import rpg.characters.Hero;

import java.util.function.*;
import java.util.*;

// メソッドを変数に代入して呼び出す例
public class Main {
    public static Integer len(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        // lenメソッドの処理ロジックを変数funcに代入する
        // lenメソッドへの参照
        // Function型は、関数オブジェクトへの参照を格納するためのインターフェース
        // Function<T, R>のように定義
        // 格納する関数の引数をT, 戻り値をRとして指定する
        Function<String, Integer> func = Main::len;

        // 変数funcに格納されている処理ロジックを引数"Java"で実行する
        int a = func.apply("Java");
        System.out.println("文字列Javaは" + a + "文字です");

        // 戻り値がない関数を格納する
        Consumer<String> func2 = System.out::println;
        func2.accept("Hello world"); // 引数は受け取るが、消費するだけで何も返さない

        // 引数がない関数を格納する
        Supplier<String> func3 = System::lineSeparator;
        System.out.println("改行します" + func3.get());

        // 複数の引数を受け取る関数を格納する
        // <引数の型, 引数の型, 戻り値の型>
        // ToIntBiFunction
        // ToLongBiFunction
        // ToDoubleBiFunction
        BiFunction<String, String, String> func4 = System::getProperty;
        System.out.println(func4.apply("java.version", "不明"));

        // ラムダ式を使って口座クラスを残高順に並び替える
        // 並び替えのアルゴリズムをラムダ式で渡している
        // 引数として関数を受け取る関数のことを高階関数という
        List<Account> list = new ArrayList<>();
        Collections.sort(list, (x, y) -> (x.zandaka - y.zandaka));

        // 高階関数を利用し戦闘不能な勇者を探す
        List<Hero> heroes = new ArrayList<>();
        boolean anyoneKnockedOut =
                heroes.stream().anyMatch(h -> h.hp == 0);
    }
}
