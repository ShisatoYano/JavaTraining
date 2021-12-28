package HeroMatangoBattle;

public class Hero {
    String name; // 名前の宣言
    int    hp;   // HPの宣言

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }

    // 何秒座るか引数で受け取る
    public void sit(int sec) {
        this.hp += sec; // 座る秒数だけHPを増やす
        System.out.println(this.name + "は" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した！");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
