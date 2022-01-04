package stringprocessing;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 文字列調査メソッド
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s1の長さは" + s1.length() + "です。");
        if (s1.isEmpty()) {
            System.out.println("s1は空文字です。");
        }

        // 文字列検索メソッド
        String s4 = "Java and JavaScript";
        if (s4.contains("Java")) {
            System.out.println("文字列s4はJavaを含んでいます");
        }
        if (s4.endsWith("Java")) {
            System.out.println("文字列s4はJavaが末尾にあります");
        }
        System.out.println("文字列s4で最初にJavaが登場する位置は"
                + s4.indexOf("Java"));
        System.out.println("文字列s4で最後にJavaが登場する位置は"
                + s4.lastIndexOf("Java"));

        // 文字列切り出しメソッド
        String s5 = "Java programming";
        System.out.println("文字列s5の4文字目以降は"
                + s5.substring(3));
        System.out.println("文字列s5の4~8文字目は"
                + s5.substring(3, 8));

        // 文字列の連結
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("Java");
        }
        String s = sb.toString();

        // splitメソッドを使った文字列の分離
        String s6 = "abc,def:ghi";
        String[] words = s6.split("[,:]");
        for (String w : words) {
            System.out.print(w + "->");
        }

        // replaceAllメソッドを使った文字列の置換
        String w = s6.replaceAll("[beh]","X");
        System.out.println(w);

        // 桁を揃えてキャラクターを表示する
        final String FORMAT = "%-9s %-13s 所持金%,6d";
        String sf = String.format
                (FORMAT, "minato", "hero", 32000);
        System.out.println(sf);

        // 処理時間を計測する
        long start = System.currentTimeMillis();
        // ここで何らかの時間がかかる処理
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間: "
                + (end - start) + "ミリ秒");

        // 現在日時を表示する
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);

        // 6つのint値とDate型の相互変換
        Calendar c = Calendar.getInstance();
        // 6つのint値からDateインスタンスを生成
        c.set(2019, 8, 22, 1, 23, 45);
        c.set(Calendar.MONTH, 9);
        Date d = c.getTime();
        System.out.println(d);
        // Dateインスタンスからint値を生成
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は" + y + "年です");
    }
}
