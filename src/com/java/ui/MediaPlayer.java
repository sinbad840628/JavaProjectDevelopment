package com.java.ui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.JFrame;

public class MediaPlayer extends JFrame implements ActionListener,ControllerEventListener,ItemListener{

	/**
	 * @param args
	 * @author Sinbad
	 * @since 2014.08.11
	 */

	//MediaPlayer��ı�����Ա������
	
	//���캯�������а�����������Ӧ�����¼��ļ�������
	public MediaPlayer(String title) {
		// TODO Auto-generated constructor stub
	}
	
	//���������������ó���˵�����
	public void setupMenu(){
		
	}//end of setupMenu
	
	public void controllerUpdate(ControllerEventListener e){
		
	}
	

	//�˵�״̬�ı��¼�����Ӧ����
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
		
	}

	//����ʱ����Ӧ��Ա����׽���͵�������ĸ����¼�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//���û�ͼ�������н���Ļ���
	public void update(Graphics g){
		
	}
	
	public void paint(Graphics g){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
