package localclass;

// ローカルクラスの利用例
// 宣言したメソッド内でのみ有効
// finalとabstract以外の修飾は行えない(必要がない)
// 外部クラスのメンバにはアクセス可能
// 自身を取り囲むメソッド内のローカル変数については、
// finalが付いたものにのみアクセス可能
public class Outer {
    int outerMember = 2; // 非finalメンバ(再代入がなく実質的にfinal)

    void outerMethod() {
        int a = 10; // 非finalローカル変数
        // ローカルクラスを宣言
        class Inner {
            public void innerMethod() {
                System.out.println("innerMethod");
                System.out.println(outerMember + a);
            }
        }
        Inner ic = new Inner(); // 同じメソッド内ですぐに利用する
        ic.innerMethod();
    }
}
