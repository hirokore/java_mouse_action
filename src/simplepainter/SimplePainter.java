package simplepainter;
import javax.swing.*;


public class SimplePainter {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�`��Tool"); //JFrame�̃C���X�^���X�𐶐�����	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �E�B���h�E�������v���O�������I������
		frame.setSize(600,400);// �E�B���h�E�̃T�C�Y�̐ݒ�
		frame.setLocationRelativeTo(null);// �E�B���h�E�̏����ʒu�̐ݒ�
//		JLabel label = new JLabel("Hello World"); // JLabel�C���X�^���X�𐶐��A�\�������������������
		Canvas canvas = new Canvas();// Canvas�C���X�^���X�����ACanvas�N���X�ō�����ȉ~�𐶐�
		frame.add(canvas);//�C���X�^���X�ϐ��ɓ��͂������̂���ʂɏo�͂�����
		// �E�B���h�E�̕\��������/���Ȃ�
		frame.setVisible(true);
		//EOF
	}

}
