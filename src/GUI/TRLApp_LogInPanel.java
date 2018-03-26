package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TRLApp_LogInPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_username;
	private final JLabel lblUserName = new JLabel("User Name");
	private final JLabel lblPassword = new JLabel("Password");
	private final JPasswordField password = new JPasswordField(10);
	/**
	 * Create the panel.
	 */
	public TRLApp_LogInPanel() 
	{
		initialize();
	}
	
	public void initialize()
	{
		setLayout(null);
		lblUserName.setBounds(118, 72, 68, 16);
		this.add(lblUserName);
		
		textField_username = new JTextField();
		textField_username.setBounds(198, 67, 130, 26);
		this.add(textField_username);
		textField_username.setColumns(10);
		lblPassword.setBounds(128, 110, 59, 16);
		this.add(lblPassword);
		password.setBounds(198, 105, 130, 26);
		password.setEchoChar('*');
		this.add(password);
	}
	
	public void clearTextField()
	{
		textField_username.setText("");
		password.setText("");
	}
}
