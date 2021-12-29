package HeroMatangoBattle;

// Heroクラスを継承
public class SuperHero extends Hero {
    // 親クラスとの差分メンバ変数
    boolean flying;

    // コンストラクタ
    public SuperHero() {
        super(); // 親クラスのコンストラクタの呼び出し
        System.out.println("SuperHeroのコンストラクタが動作");
    }

    // 親クラスとの差分メンバ関数
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }

    // 親クラスのattack()を呼び出す
    public void attack(Matango m) {
        super.attack(m); // 親インスタンスのattack()を呼び出す
        if (this.flying) {
            super.attack(m); // 空を飛んでいたら2回攻撃できる
        }
    }
}
