package rpg.monsters;

public class Matango {
    final int LEVEL = 10; // finalを付けて定数にする
    public char suffix;

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
