

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bankingScreen {

	private JFrame frame;
	private JTextField SignInField;
	private MenuPage mp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bankingScreen window = new bankingScreen();
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
	public bankingScreen() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 647, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSignIn = new JButton("Submit AccountNumber");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//ATMc at = new ATMc();
				//if(at.checkAccNum(id) == true){
				
				
				
				//}
				
			}
		});
		btnSignIn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String signInName;
				signInName = SignInField.getText();
				int id = Integer.parseInt(signInName);
				ATMc at = new ATMc();
				at.checkAccNum(id);
				Account a = ATMc.Read();
				mp = new MenuPage();
				frame.dispose();
				mp.setVisible(true);
				
			}
		});
		btnSignIn.setBounds(233, 229, 171, 35);
		frame.getContentPane().add(btnSignIn);
		
		SignInField = new JTextField();
		SignInField.setBounds(208, 153, 216, 45);
		frame.getContentPane().add(SignInField);
		SignInField.setColumns(10);
	}
}
