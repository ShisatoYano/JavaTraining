package anonymousclass;

import generics.Pocket;

// 匿名クラスの利用例
// 宣言と利用を同地に行う
// メソッドの中で独自のクラスを定義してそのインスタンスを使いたい
// ただし、インスタンスの生成は今回1回に限り、二度と行わない
public class Main {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<>();
        System.out.println
                ("使い捨てのインスタンスを作りpocketに入れる");
        // メンバ2つを持つ匿名クラスを定義して
        // 宣言すると同時にインスタンス化
        // 匿名クラス自身の名前を指定する必要はない
        // 代わりに、どのクラスを継承して匿名クラスを作るかを指定する
        pocket.put(new Object() {
            String innerField;
            void innerMethod() {}
        });
    }
}
