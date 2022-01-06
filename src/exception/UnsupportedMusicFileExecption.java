package exception;

public class UnsupportedMusicFileExecption extends Exception{
    // エラーメッセージを受け取るコンストラクタ
    public UnsupportedMusicFileExecption(String msg) {
        super(msg);
    }
}
