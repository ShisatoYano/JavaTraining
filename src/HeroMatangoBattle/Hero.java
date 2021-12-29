package HeroMatangoBattle;

public class Hero extends Character {
    String name    = "ミナト";
    private int hp = 100;

    // コンストラクタ
    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }

    // 戦う
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    // 転ぶ
    // 子クラスでのオーバーライドを禁止するメソッド
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ！");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAME OVERです");
    }
}
