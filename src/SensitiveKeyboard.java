import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener  {
	JFrame f = new JFrame();
	
public static void main(String[] args) {
	SensitiveKeyboard c = new SensitiveKeyboard();
	c.press();
	
	
}
void press() {
	f.setVisible(true);
	f.addKeyListener(this);
	
}

static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");
}

}




