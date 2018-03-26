package GUI;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TRLApp {
	
	JFrame frame;
	private JPanel mainPanel = new JPanel();
	private CardLayout cl = new CardLayout();
	private TRLApp_LogInPanel loginPanel = new TRLApp_LogInPanel();
	private TRLApp_MenuPanel menu = new TRLApp_MenuPanel();
	private final JButton LogInBtn = new JButton("Log In");
	private final JButton cancelBtn = new JButton("Cancel");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRLApp window = new TRLApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TRLApp()
	{
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 359);
		mainPanel.setLayout(cl);
		mainPanel.add(loginPanel, "logIN");
		mainPanel.add(menu, "menu");
		
		JButton checkInBtn = new JButton("Check In");
		checkInBtn.setBounds(206, 83, 117, 29);
		menu.add(checkInBtn);
		
		JButton checkOutBtn = new JButton("Check Out");
		checkOutBtn.setBounds(206, 132, 117, 29);
		menu.add(checkOutBtn);
		
		JButton LogOutBtn = new JButton("Log Out");
		LogOutBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(mainPanel, "logIN");
			}
		});
		LogOutBtn.setBounds(206, 185, 117, 29);
		menu.add(LogOutBtn);
		LogInBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				loginPanel.clearTextField(); 
				cl.show(mainPanel, "menu");
			}
		});
		LogInBtn.setBounds(288, 158, 117, 29);
		
		loginPanel.add(LogInBtn);
		cancelBtn.setBounds(141, 158, 117, 29);
		loginPanel.add(cancelBtn);
		cl.show(mainPanel, "1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(mainPanel);
		frame.setVisible(true);
	}
}
