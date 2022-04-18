package simplepainter;
import javax.swing.*;


public class SimplePainter {
	public static void main(String[] args) {
		JFrame frame = new JFrame("描画Tool"); //JFrameのインスタンスを生成する	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ウィンドウを閉じたらプログラムを終了する
		frame.setSize(600,400);// ウィンドウのサイズの設定
		frame.setLocationRelativeTo(null);// ウィンドウの初期位置の設定
//		JLabel label = new JLabel("Hello World"); // JLabelインスタンスを生成、表示したい文字列を書く
		Canvas canvas = new Canvas();// Canvasインスタンス生成、Canvasクラスで作った楕円を生成
		frame.add(canvas);//インスタンス変数に入力したものを画面に出力させる
		// ウィンドウの表示をする/しない
		frame.setVisible(true);
		//EOF
	}

}
