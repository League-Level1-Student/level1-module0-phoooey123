import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	public static void main(String[] args) {
	
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
	
	}

	public void showButton() {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		JButton jb = new JButton();
		jf.add(jb);
		jb.setText("Click For Fortune");
		jf.pack();
		jb.addActionListener(this);
		System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You Will Get Tresure!");	
			}
			else if(rand == 1) {
				JOptionPane.showMessageDialog(null, "You Will Go On A Journey!");
			}
			else if(rand == 2) {
				JOptionPane.showMessageDialog(null, "You Will Be Happy");
			}
			else if (rand == 3) {
				JOptionPane.showMessageDialog(null, "You Will Be Sad");
			}
			else {
				JOptionPane.showMessageDialog(null, "You Will have good luck!");
			}
		JOptionPane.showMessageDialog(null, "WooHoo");
	}
}
