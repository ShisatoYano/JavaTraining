package innerclass;

public class Main {
    public static void main(String[] args) {
        // 無関係なクラスからは外部クラス名.メンバクラス名で利用
        // 外部クラスのメンバにアクセスできるがstaticなものに限られる
        // staticなしの場合
        // 外部クラスのインスタンスがなければnewできない
        // Outer o = new Outer(); Outer.Inner oi = o.new Inner()
        // 結びついている外部インスタンスの非staticメンバにもアクセスできる
        Outer.Inner ic = new Outer.Inner();
    }
}
