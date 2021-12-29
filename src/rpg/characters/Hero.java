package rpg.characters;

import rpg.monsters.Matango;

public class Hero {
    private int hp      = 100;
    private String name = "ミナト";
    public static int money = 1000;

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAME OVERです");
    }

    // package private
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        System.out.println("お化けキノコ" + m.suffix
                + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断");
        }

        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }

        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断");
        }

        this.name = name;
    }

    public String toString() {
        return "名前:" + this.name + "/HP:" + this.hp;
    }

    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o instanceof Hero) {
            Hero h = (Hero)o;
            if (this.name.equals(h.name)) {
                return true;
            }
        }
        return false;
    }

    // 静的メソッド
    // メソッド自体がクラスに属するようになる
    // インスタンスにメソッドの分身が準備される
    // インスタンスを生み出さなくても呼び出せる
    public static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
    }
}
