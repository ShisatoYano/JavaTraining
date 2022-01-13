package thread.countdouwstop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("止めるにはSTOPを入力してください");
        System.out.println("カウントダウンを開始します");
        PrintingThread t = new PrintingThread();
        t.start(); // 別スレッドを開始
        String input = new Scanner(System.in).nextLine(); // 入力処理
        if (input.equals("STOP")) {
            // スレッドの中断を要求してrun()の終了を待つ
            t.stopReq.set(true);
        }
        try {
            t.join();
        } catch (InterruptedException e) {;}
    }
}
