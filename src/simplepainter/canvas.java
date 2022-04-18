package simplepainter;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;

class Canvas extends JPanel implements MouseListener,MouseMotionListener{
	// �}�E�X�̍��W���i�[����ϐ���錾��������
	private int x = -100;	//�N������(0,0)�\����h������
	private int y = -100;	//window�̊O(-100,-100)�ɐݒ肵�Ă���
	
	// �R���X�g���N�^
	public Canvas() {
		addMouseListener(this); //�}�E�X�̏����擾���鏀��
		addMouseMotionListener(this); //�h���b�O���������擾���鏀��
		setSize(600,400);		//�L�����o�X�T�C�Y�̐ݒ�

	}
	
	@Override
	// �ȉ~��\�����郁�\�b�h
	protected void paintComponent(Graphics g) {
		g.setColor(Color.RED);			//�ȉ~�̐F��ݒ肷��
//		g.drawOval(100, 100, 50, 50);	//�ȉ~�̊�����ݒ肷��
		g.fillOval(x-5, y-5, 10, 10);	//fillOval�͓������h��Ԃ��ꂽ�ȉ~��`�悷�郁�\�b�h
	}

	// �ϐ�e�̓}�E�X�̍��W�≟���ꂽ�{�^���Ȃǂ̏����i�[����ϐ�
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	//�}�E�X�������ꂽ���̏��������郁�\�b�h
	public void mousePressed(MouseEvent e) {
		x = e.getX();	//�}�E�X�̍��W�̎擾
		y = e.getY();	//�}�E�X�̍��W�̎擾
		repaint();		//�ĕ`�悷��
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
	//�h���b�O���̍��W���擾���Đ���ۑ����郁�\�b�h
	public void mouseDragged(MouseEvent e) {
		x = e.getX();	//�}�E�X�̍��W�̎擾
		y = e.getY();	//�}�E�X�̍��W�̎擾
		repaint();		//�ĕ`�悷��
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
