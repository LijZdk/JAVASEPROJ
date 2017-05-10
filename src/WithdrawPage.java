import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WithdrawPage {

	private JFrame frame;
	private JTextField txtWithdraw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawPage window = new WithdrawPage();
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
	public WithdrawPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 450);
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
		btnExit.setBounds(571, 346, 66, 55);
		frame.getContentPane().add(btnExit);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ATMc.withdraw();
			}
		});
		btnEnter.setBounds(247, 193, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		txtWithdraw = new JTextField();
		txtWithdraw.setText("Withdraw:");
		txtWithdraw.setBounds(250, 151, 86, 31);
		frame.getContentPane().add(txtWithdraw);
		txtWithdraw.setColumns(10);
		
		JTextPane txtpnBalance = new JTextPane();
		txtpnBalance.setText("Balance: " + ATMc.acc1.getBalance());
		txtpnBalance.setBounds(414, 56, 129, 23);
		frame.getContentPane().add(txtpnBalance);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
