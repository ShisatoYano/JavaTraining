package HeroMatangoBattle;

// 未完成部分を含んだ抽象クラス
public abstract class Character {
    String name;
    int    hp;

    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }

    // 未完成の抽象メソッド
    public abstract void attack(Matango m);
}
