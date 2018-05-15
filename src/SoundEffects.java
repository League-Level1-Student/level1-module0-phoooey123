import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener{
	JFrame franku = new JFrame();
	JPanel panu = new JPanel();
	JButton alertu = new JButton();
	JButton beepu = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	public static void main(String[] args) {
		SoundEffects sf = new SoundEffects();
		sf.alert();
		sf.beep();
	}
	
	
	
	
	
	private void beep() {
		panu.add(beepu);
		beepu.setText("Beep!");
		beepu.setPreferredSize(BIG);
		franku.pack();
		
		franku.setDefaultCloseOperation(franku.EXIT_ON_CLOSE);
		beepu.addActionListener(this);
	}
	private void alert() {
	
		franku.setVisible(true);
		alertu.setText("Alert!");
		
		franku.add(panu);
		panu.add(alertu);
		alertu.setPreferredSize(BIG);
		franku.pack();
		franku.setDefaultCloseOperation(franku.EXIT_ON_CLOSE);
		alertu.addActionListener(this);
		
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == alertu) {
		playSound("Alert.wav");
		}
		else if(e.getSource() == beepu) {
			playSound("beep.wav");
		}
	}
}