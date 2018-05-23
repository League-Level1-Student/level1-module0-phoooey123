package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame franku = new JFrame();
	JPanel panu = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public static void main(String[] args) {
	CutenessTV ctv = new CutenessTV();
	ctv.GUI();
	
	
	
	
	
	
	
	
}
void GUI() {
	franku.add(panu);
	panu.add(button1);
	panu.add(button2);
	panu.add(button3);
	franku.setVisible(true);
	franku.setDefaultCloseOperation(franku.EXIT_ON_CLOSE);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button1.setText("Ducks");
	button2.setText("Frog");
	button3.setText("Fluffy Unicorns");
	franku.pack();
}

void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}
void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}
void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}
void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button1) {
		showDucks();
	}
	if(e.getSource() == button2) {
		showFrog();
	}
	if(e.getSource() == button3) {
		showFluffyUnicorns();
	}
}
}
