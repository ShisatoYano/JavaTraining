package jvm.processbuilder;

// 自分のJavaプログラムから他のプログラムを起動する
// 自身で行った計算処理の結果をファイルに出力し、
// 完了したらメモ帳を起動してそれを表示する
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("計算を開始します");
        /* 何らかの計算処理 */
        System.out.println("計算完了。結果をメモ帳で表示します");
        ProcessBuilder pb = new ProcessBuilder(
                "c:\\windows\\system32\\notepad.exe",
                "calcreport.txt"
        );
        pb.start(); // 起動
    }
}
