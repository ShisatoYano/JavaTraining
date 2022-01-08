package instance.copy;

// clone()による複製をサポートしたHeroクラス
// Cloneable: マーカーインターフェース
public class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;

    // clone()をオーバーライド
    // Objectクラスのclone()はprotectedなので外部から呼び出せない
    // オーバーライド時にpublicでオーバーライドする
    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword.clone();
        return result;
    }
}
