package jvm.timezone;

import java.util.*;

// タイムゾーン
// プログラムが動作しているPCの置かれた地域で使われている
// 標準時と世界標準時との時差
public class Main {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getDefault();
        System.out.print("現在のタイムゾーン");
        System.out.println(tz.getDisplayName());
        if (tz.useDaylightTime()) {
            System.out.println("夏時間を採用しています");
        } else {
            System.out.println("夏時間を採用していません");
        }
        System.out.print("世界標準時との時差は");
        // ミリ秒単位の時差を時間単位に変換
        System.out.println(tz.getRawOffset() / 3600000 + "時間");
    }
}
