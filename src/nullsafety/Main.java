package nullsafety;

import java.util.*;

// Optionalクラスを利用してnull安全性に配慮する
// nullを格納できない、格納される可能性を考慮した
// プログラムの記述が強制されるしくみを備える
// 上記を呼び出し元に強制する効果がある
public class Main {
    // 文字列sを挟んで装飾するメソッド
    // 文字列sがnullまたは長さ0の場合は、nullを返す
    // 戻り値はnullの可能性があることを明示するために、
    // 単なるStringではなくOptional<String>とする
    public static Optional<String> decorate(String s, char c) {
        String r;
        if (s == null || s.length() == 0) {
            r = null;
        } else {
            r = c + s + c;
        }
        return Optional.ofNullable(r);
    }

    public static void main(String[] args) {
        Optional<String> s = decorate("", '*');
        System.out.println(s.orElse("nullのため処理できません"));
    }
}
