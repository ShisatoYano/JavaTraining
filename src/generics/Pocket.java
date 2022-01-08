package generics;

// 仮型引数を伴うクラス定義
// 利用する際に実型引数を指定して決定する
// ジェネリクスを利用することで、型を制約しない汎用的なクラスを提供でき、
// 同時に、クラスを使う人自身で型安全性を確保することができる
// intなどの基本データ型は利用できない
// ジェネリクスを用いたクラスの配列を作ることはできない
// Throwableの子孫であるクラス(例外クラス)では、ジェネリクスは使えない
public class Pocket<E> {
    private E data;
    public void put(E d) {this.data = d;}
    public E get() {return this.data;}
}
