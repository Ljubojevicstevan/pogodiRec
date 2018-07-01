package pogodiRec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import clasess.klasa;

public class main {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}
	klasa a=new klasa();
	private JTextField textField_1;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(115, 57, 341, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPogodi = new JButton("pogodi");
		btnPogodi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//SVE SE RADI OVDE TJ SAMO 3 LINIJE KODA...PRVA LINIJA JESTE STAVLJANJE VREDNOSTI U PROMENLJIVU SEQ,POTOM POZIVANJE FUNKCIJE PROVERIREC()
				//I NA KRAJU ISPISIVANJE DOBIJENE VREDNOSTI
				a.setSeq(textField.getText());
				a.proveriRec();
				textField_1.setText(String.valueOf(a.getStanje()));
				
			}
		});
		btnPogodi.setBounds(243, 117, 89, 23);
		frame.getContentPane().add(btnPogodi);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(206, 88, 157, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
