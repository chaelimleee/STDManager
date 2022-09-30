package GUImodeling;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Admin.AdminVO;
import Login.CreateAdmin;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class _1_Loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton loginBtn;
	private JPasswordField passwordField;
	private String id;
	private String pwd;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public _1_Loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void run() throws SQLException {
		Scanner scan = new Scanner (System.in);
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
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new EmptyBorder(0, 0, 0, 0));
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
		passwordField.setBackground(new Color(255, 255, 255));
		contentPane.add(passwordField);
	}
	void loginBtn() { 
		loginBtn = new JButton("로그인");
		loginBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		loginBtn.setBounds(138, 194, 160, 38);
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(login()) {
							dispose();
							new _2_TodayTask().run();
					}else loginFail(); //이거 해결해야함<< 실패하면 문구 뜨게
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});	
		contentPane.add(loginBtn);
	}
	void loginFail() {
		JLabel lblNewLabel_3 = new JLabel("아이디 또는 비밀번호가 맞지않습니다.");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(97, 179, 240, 15);
		contentPane.add(lblNewLabel_3);
	}
	boolean login() throws SQLException {
		read();
		return new Login.login(id,pwd).chk();
	}
	
	@SuppressWarnings("deprecation")
	void read() {
		id = textField.getText();
		pwd = passwordField.getText();
	}
}
