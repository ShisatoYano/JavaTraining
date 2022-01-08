package lambda;

import java.util.function.*;

// 関数をプログラム実行中の必要になったタイミングで生み出して即時利用できる
// 関数をその場で生み出し、代入し、呼び出す
public class Main {
    public static void main(String[] args) {
        // ラムダ式を用いて、関数定義とその実体の即時生成が指示される
        // ラムダ式が評価されると、関数の実体がメモリ上に生成され、
        // その実体を指す参照に化ける
        Function<String, Integer> func =
                (String s) -> {return s.length();};
        int n = func.apply("Java");
        System.out.println("文字列「Java」は" + n + "文字です");
    }
}
