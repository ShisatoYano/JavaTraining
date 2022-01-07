package instance.tostring;

public class Hero {
    private String name;
    private int hp, mp;

    // toString()のオーバーライド
    public String toString() {
        return "Hero (Name = " + this.name
                + "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }
}
