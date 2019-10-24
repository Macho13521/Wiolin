import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Rejestracja {

	private JFrame frame;
	private JTextField pLogin;
	private JTextField pEmail;
	private JPasswordField pHaslo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rejestracja window = new Rejestracja();
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
	public Rejestracja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 812, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 404, 451);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Rejestracja.class.getResource("/Tekstury/clef.png")));
		lblNewLabel.setBounds(61, 81, 257, 269);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(402, 0, 394, 451);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(SystemColor.textHighlight);
		lblLogin.setBounds(80, 80, 61, 14);
		panel_1.add(lblLogin);
		
		pLogin = new JTextField();
		pLogin.setCaretColor(Color.WHITE);
		pLogin.setForeground(Color.WHITE);
		pLogin.setBorder(null);
		pLogin.setBackground(Color.DARK_GRAY);
		pLogin.setBounds(80, 100, 232, 20);
		panel_1.add(pLogin);
		pLogin.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(80, 125, 232, 8);
		panel_1.add(separator);
		
		pEmail = new JTextField();
		pEmail.setForeground(Color.WHITE);
		pEmail.setColumns(10);
		pEmail.setCaretColor(Color.WHITE);
		pEmail.setBorder(null);
		pEmail.setBackground(Color.DARK_GRAY);
		pEmail.setBounds(80, 168, 232, 20);
		panel_1.add(pEmail);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(80, 195, 232, 8);
		panel_1.add(separator_1);
		
		pHaslo = new JPasswordField();
		pHaslo.setCaretColor(Color.WHITE);
		pHaslo.setBorder(null);
		pHaslo.setForeground(Color.WHITE);
		pHaslo.setBackground(Color.DARK_GRAY);
		pHaslo.setBounds(80, 251, 232, 20);
		panel_1.add(pHaslo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(80, 276, 232, 8);
		panel_1.add(separator_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(SystemColor.textHighlight);
		lblEmail.setBounds(80, 154, 61, 14);
		panel_1.add(lblEmail);
		
		JLabel lblHaso = new JLabel("Has\u0142o");
		lblHaso.setForeground(SystemColor.textHighlight);
		lblHaso.setBounds(80, 225, 61, 14);
		panel_1.add(lblHaso);
		
		JButton btnNewButton = new JButton("Zarejestruj");
		btnNewButton.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(80, 311, 232, 47);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Rejestracja.class.getResource("/Tekstury/sign-in.png")));
		lblNewLabel_1.setBounds(152, 11, 67, 66);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Rejestracja.class.getResource("/Tekstury/key.png")));
		lblNewLabel_2.setBounds(55, 251, 30, 33);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Rejestracja.class.getResource("/Tekstury/mail.png")));
		lblNewLabel_3.setBounds(55, 168, 30, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Rejestracja.class.getResource("/Tekstury/shield.png")));
		lblNewLabel_4.setBounds(55, 100, 30, 33);
		panel_1.add(lblNewLabel_4);
	}
}
