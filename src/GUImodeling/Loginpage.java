package GUImodeling;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private String id;
	private String pwd;

	public Loginpage() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void run() {
		title();
		id();
		password();
		loginBtn();
		setVisible(true);

	}
	
	//타이틀
	void title() {
		JLabel lblNewLabel = new JLabel("학생관리시스템");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(126, 10, 172, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("관리의 정석");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(167, 42, 99, 31);
		contentPane.add(lblNewLabel_1);
	}
	
	void id() {
		JPanel panel = new JPanel();
		panel.setBounds(119, 93, 196, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 71, 31);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(189, 93, 126, 32);
		textField.setColumns(15);
		contentPane.add(textField);
	}
	void password() {
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(119, 141, 196, 31);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("비밀번호");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 0, 71, 31);
		panel_1.add(lblNewLabel_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 141, 126, 31);
		contentPane.add(passwordField);
	}
	void loginBtn() { 
		JButton loginBtn = new JButton("로그인");
		loginBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		loginBtn.setBounds(138, 194, 160, 38);
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//아디 비번 맞는지 돌려서 맞으면 로긴
				new TodayTask().run();
			}
		});
		contentPane.add(loginBtn);
	}
}
