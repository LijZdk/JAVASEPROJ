import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DepositPage {

	private JFrame frame;
	private JTextField txtDeposit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositPage window = new DepositPage();
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
	public DepositPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage mp = new MenuPage();
				frame.dispose();
				mp.setVisible(true);
				
			}
		});
		btnExit.setBounds(577, 354, 77, 59);
		frame.getContentPane().add(btnExit);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(247, 193, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		txtDeposit = new JTextField();
		txtDeposit.setText("Deposit:");
		txtDeposit.setBounds(250, 151, 86, 31);
		frame.getContentPane().add(txtDeposit);
		txtDeposit.setColumns(10);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
