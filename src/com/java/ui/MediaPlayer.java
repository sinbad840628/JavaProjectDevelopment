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

	//MediaPlayer类的变量成员的声明
	
	//构造函数，其中包括了设置响应窗口事件的监听器；
	public MediaPlayer(String title) {
		// TODO Auto-generated constructor stub
	}
	
	//本方法是用来设置程序菜单栏的
	public void setupMenu(){
		
	}//end of setupMenu
	
	public void controllerUpdate(ControllerEventListener e){
		
	}
	

	//菜单状态改变事件的响应函数
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
		
	}

	//动作时间响应成员；捕捉发送到本对象的各个事件
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//调用绘图函数进行界面的绘制
	public void update(Graphics g){
		
	}
	
	public void paint(Graphics g){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
