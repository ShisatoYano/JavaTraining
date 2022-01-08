package jvm.locale;

import java.util.*;
import java.text.*;

// ロケールと国際化
// JVMはOSから、どのような場所で、どのような言語を使うユーザーを
// 前提として動作するかという情報を受け取る
// これらはロケールと総称される
public class Main {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault(); // デフォルトロケールを取得
        System.out.println(loc.getCountry() + "-" + loc.getLanguage());
        String now = (new SimpleDateFormat()).format(new Date());
        if (loc.getLanguage().equals("ja")) {
            System.out.println("現在の時刻は" + now);
        } else {
            System.out.println("Current time is " + now);
        }
    }
}
