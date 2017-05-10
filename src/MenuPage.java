import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPage window = new MenuPage();
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
	public MenuPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WithdrawPage wp = new WithdrawPage();
				frame.dispose();
				wp.setVisible(true);
				 
				//frame.
			}
		});
		btnWithdraw.setBounds(58, 75, 106, 47);
		frame.getContentPane().add(btnWithdraw);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositPage dp = new DepositPage();
				frame.dispose();
				dp.setVisible(true);
			}
		});
		btnDeposit.setBounds(468, 78, 106, 41);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnBalance = new JButton("Balance");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BalancePage bp = new BalancePage();
				frame.dispose();
				bp.setVisible(true);
			}
		});
		btnBalance.setBounds(278, 258, 106, 41);
		frame.getContentPane().add(btnBalance);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(572, 358, 62, 41);
		frame.getContentPane().add(btnExit);
	}

	public void setVisible(boolean b){
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
