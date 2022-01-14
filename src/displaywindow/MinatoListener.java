package displaywindow;

import java.awt.event.*;

// ActionListenerを実装したクラスの定義
// ボタンクリックのイベントハンドラを登録する
public class MinatoListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("押されました！！");
    }
}
