package HeroMatangoBattle;

public class Wizard extends Character {
    String name;
    int mp = 50;

    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 1;
        System.out.println("1ポイントのダメージを与えた！");
    }

    public void fireball(Monster m) {
        System.out.println(this.name + "は火の玉を放った！");
        System.out.println("敵に20ポイントのダメージ");
        m.hp -= 20;
        this.mp -= 5;
    }
}
