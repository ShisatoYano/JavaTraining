package functioninterface;

import rpg.characters.Hero;

import java.util.Set;

// 関数インターフェースの利用
// 抽象メソッド宣言に記述した引数と型が一致する関数オブジェクトを格納できる
// 抽象メソッド名で呼び出すことができる
@FunctionalInterface // 関数インターフェースとして宣言するとコンパイラに伝える
public interface PartyInfoConsumer {
    public abstract void process(Set<Hero> party, Hero leader, String pName);
}
