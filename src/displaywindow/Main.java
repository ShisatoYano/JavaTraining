package displaywindow;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.*;

// Swing APIを利用することで画面上に簡単にウィンドウを表示できる
// javax.swing.JWindow: 枠やツールバーがない
// javax.swing.JFrame: 枠やツールバーがある
// javax.swing.JDialog: 対話入力用の小さなもの
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("はじめてのSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello world!!"); // ラベルを生成
        frame.add(label); // フレームに追加
        JButton button = new JButton("押してね"); // ボタンを生成
        button.addActionListener(new MinatoListener());
        frame.add(button); // フレームに追加

        // 座標指定によるウィジェット配置
//        frame.setLayout(null);
//        JLabel label = new JLabel("Hello World!!");
//        label.setLocation(10, 10); // ラベルの座標
//        label.setSize(200, 20); // サイズを指定
//        frame.add(label);
//        JButton button = new JButton("押してね");
//        button.setLocation(250, 100); // ボタンの座標
//        button.setSize(100, 20); // サイズを指定
//        frame.add(button);

        // BorderLayoutを設定
//        frame.setLayout(new BorderLayout());
//        JLabel label = new JLabel("Hello World!!");
//        frame.add(label, BorderLayout.CENTER); // 中央に配置
//        JButton buttonN = new JButton("上ボタン");
//        frame.add(buttonN, BorderLayout.NORTH); // 上に配置
//        JButton buttonS = new JButton("下ボタン");
//        frame.add(buttonS, BorderLayout.SOUTH); // 下に配置
//        JButton buttonW = new JButton("左ボタン");
//        frame.add(buttonW, BorderLayout.WEST); // 左に配置
//        JButton buttonE = new JButton("右ボタン");
//        frame.add(buttonE, BorderLayout.EAST); // 右に配置

        frame.setVisible(true);
        System.out.println("フレームを表示");
    }
}
