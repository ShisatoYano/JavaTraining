package thread.countdouwstop;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

// 並列処理させるクラス
// Threadクラスを継承してrun()をオーバーライドする
// run()には別のスレッドで処理したい内容を書き込む
// 別スレッドの実行を開始したい場所でクラスをインスタンス化し
// start()を呼び出す
public class PrintingThread extends Thread {
    // スレッド中断の要請を管理するフィールド
    final AtomicBoolean stopReq = new AtomicBoolean(false);

    public void run() {
        for (int i = 9; i >= 0; i--) {
            // 中断要望が届いてからループを抜けてrun()を終了する
            if (this.stopReq.get()) {
                break;
            }
            System.out.print(i + "..");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) { ; }
        }
    }
}
