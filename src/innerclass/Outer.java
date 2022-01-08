package innerclass;

// static付きメンバクラスの利用例
public class Outer {
    int outerField;
    static int outerStaticField;

    // メンバクラス
    // クラスブロックの中でメンバとして宣言する
    // protected, privateといったアクセス就職も利用可能
    static class Inner {
        void innerMethod() {
            outerStaticField = 10; // staticな外部クラスメンバのみ利用可
        }
    }

    void outerMethod() {
        Inner ic = new Inner();
    }
}
