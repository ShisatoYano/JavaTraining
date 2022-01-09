package csv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // CSV形式データの読み取り
        String s = "Minato,Asaka,Sugawara";
        String[] st = s.split(",");
        for (String t : st) {
            System.out.println(t);
        }
    }
}
