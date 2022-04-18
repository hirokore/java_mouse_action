package simplepainter;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;

class Canvas extends JPanel implements MouseListener,MouseMotionListener{
	// マウスの座標を格納する変数を宣言かつ初期化
	private int x = -100;	//起動時の(0,0)表示を防ぐため
	private int y = -100;	//windowの外(-100,-100)に設定している
	
	// コンストラクタ
	public Canvas() {
		addMouseListener(this); //マウスの情報を取得する準備
		addMouseMotionListener(this); //ドラッグ処理情報を取得する準備
		setSize(600,400);		//キャンバスサイズの設定

	}
	
	@Override
	// 楕円を表示するメソッド
	protected void paintComponent(Graphics g) {
		g.setColor(Color.RED);			//楕円の色を設定する
//		g.drawOval(100, 100, 50, 50);	//楕円の割合を設定する
		g.fillOval(x-5, y-5, 10, 10);	//fillOvalは内部が塗りつぶされた楕円を描画するメソッド
	}

	// 変数eはマウスの座標や押されたボタンなどの情報を格納する変数
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	//マウスが押された時の処理をするメソッド
	public void mousePressed(MouseEvent e) {
		x = e.getX();	//マウスの座標の取得
		y = e.getY();	//マウスの座標の取得
		repaint();		//再描画する
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	@Override
	//ドラッグ中の座標を取得して線を保存するメソッド
	public void mouseDragged(MouseEvent e) {
		x = e.getX();	//マウスの座標の取得
		y = e.getY();	//マウスの座標の取得
		repaint();		//再描画する
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
