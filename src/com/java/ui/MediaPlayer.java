package com.java.ui;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
