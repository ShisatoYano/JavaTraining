package HeroMatangoBattle;

public class Matango extends Monster {
    final int LEVEL = 10; // finalを付けて定数にする
    char suffix;

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
