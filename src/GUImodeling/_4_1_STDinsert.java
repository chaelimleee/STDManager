package GUImodeling;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;

public class _4_1_STDinsert extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField ageTextField;
	private JTextField aadrTextField;
	private JTextField phoneTextField;
	private JTextField SCDtextField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_4_1_STDinsert frame = new _4_1_STDinsert();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public _4_1_STDinsert() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 480, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학생등록");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 10, 150, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("* 이름과 전화번호는 필수사항입니다.");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_1.setBounds(35, 75, 394, 15);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 94, 394, 407);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(255, 204, 204));
		namePanel.setBounds(0, 0, 196, 32);
		panel.add(namePanel);
		namePanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(0, 0, 49, 32);
		namePanel.add(nameLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(255, 204, 204));
		layeredPane.setBounds(0, 0, 49, 32);
		namePanel.add(layeredPane);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(15);
		nameTextField.setBorder(new EmptyBorder(0, 0, 0, 0));
		nameTextField.setBackground(Color.WHITE);
		nameTextField.setBounds(48, 0, 148, 32);
		namePanel.add(nameTextField);
		
		JPanel agePanel = new JPanel();
		agePanel.setBackground(new Color(255, 204, 204));
		agePanel.setLayout(null);
		agePanel.setBounds(248, 0, 146, 32);
		panel.add(agePanel);
		
		JLabel ageLabel = new JLabel("나이");
		ageLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		ageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ageLabel.setBounds(0, 0, 49, 32);
		agePanel.add(ageLabel);
		
		ageTextField = new JTextField();
		ageTextField.setColumns(15);
		ageTextField.setBorder(new EmptyBorder(0, 0, 0, 0));
		ageTextField.setBackground(Color.WHITE);
		ageTextField.setBounds(48, 0, 98, 32);
		agePanel.add(ageTextField);
		
		JPanel addrPanel = new JPanel();
		addrPanel.setLayout(null);
		addrPanel.setBackground(new Color(255, 204, 204));
		addrPanel.setBounds(0, 108, 394, 32);
		panel.add(addrPanel);
		
		JLabel addrNameLabel = new JLabel("주소");
		addrNameLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		addrNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addrNameLabel.setBounds(0, 0, 49, 32);
		addrPanel.add(addrNameLabel);
		
		aadrTextField = new JTextField();
		aadrTextField.setColumns(15);
		aadrTextField.setBorder(new EmptyBorder(0, 0, 0, 0));
		aadrTextField.setBackground(Color.WHITE);
		aadrTextField.setBounds(48, 0, 346, 32);
		addrPanel.add(aadrTextField);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setBackground(new Color(255, 204, 204));
		phonePanel.setBounds(0, 54, 196, 32);
		panel.add(phonePanel);
		phonePanel.setLayout(null);
		
		JLabel phoneLabel = new JLabel("전화번호");
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		phoneLabel.setBounds(0, 0, 49, 32);
		phonePanel.add(phoneLabel);
		
		phoneTextField = new JTextField();
		phoneTextField.setColumns(15);
		phoneTextField.setBorder(new EmptyBorder(0, 0, 0, 0));
		phoneTextField.setBackground(Color.WHITE);
		phoneTextField.setBounds(48, 0, 148, 32);
		phonePanel.add(phoneTextField);
		
		JPanel sexPanel = new JPanel();
		sexPanel.setLayout(null);
		sexPanel.setBounds(216, 54, 178, 32);
		panel.add(sexPanel);
		
		JLabel phoneLabel_1 = new JLabel("성별");
		phoneLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		phoneLabel_1.setBounds(0, 0, 49, 32);
		sexPanel.add(phoneLabel_1);
		
		JTextPane phoneTextPane_1 = new JTextPane();
		phoneTextPane_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		phoneTextPane_1.setFocusTraversalPolicyProvider(true);
		phoneTextPane_1.setBackground(new Color(255, 204, 204));
		phoneTextPane_1.setAlignmentY(0.0f);
		phoneTextPane_1.setAlignmentX(0.0f);
		phoneTextPane_1.setBounds(0, 0, 49, 32);
		sexPanel.add(phoneTextPane_1);
		
		

		JRadioButton sex1_RadioBtn = new JRadioButton("남");
		sex1_RadioBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		sex1_RadioBtn.setBounds(68, 5, 40, 23);
		sexPanel.add(sex1_RadioBtn);
		
		JRadioButton sex2_RadioBtn = new JRadioButton("여");
		sex2_RadioBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		sex2_RadioBtn.setBounds(121, 5, 49, 23);
		sexPanel.add(sex2_RadioBtn);
		//버튼 그룹으로 묶기
		ButtonGroup group = new ButtonGroup();
		group.add(sex1_RadioBtn);
		group.add(sex2_RadioBtn);
		
		JPanel SCDPanel = new JPanel();
		SCDPanel.setBackground(new Color(255, 204, 204));
		SCDPanel.setLayout(null);
		SCDPanel.setBounds(0, 161, 196, 32);
		panel.add(SCDPanel);
		
		JLabel SCDLabel = new JLabel("관리시작일");
		SCDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SCDLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		SCDLabel.setBounds(0, 0, 68, 32);
		SCDPanel.add(SCDLabel);
		
		SCDtextField = new JTextField();
		SCDtextField.setToolTipText("");
		SCDtextField.setHorizontalAlignment(SwingConstants.CENTER);
		SCDtextField.setColumns(15);
		SCDtextField.setBorder(new EmptyBorder(0, 0, 0, 0));
		SCDtextField.setBackground(Color.WHITE);
		SCDtextField.setBounds(68, 0, 128, 32);
		SCDPanel.add(SCDtextField);
		
		JPanel memoPanel = new JPanel();
		memoPanel.setLayout(null);
		memoPanel.setBounds(0, 214, 394, 191);
		panel.add(memoPanel);
		
		JLabel memoLabel = new JLabel("메모");
		memoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		memoLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		memoLabel.setBounds(0, 0, 49, 32);
		memoPanel.add(memoLabel);
		
		textField = new JTextField();
		textField.setColumns(15);
		textField.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField.setBackground(Color.WHITE);
		textField.setBounds(0, 33, 394, 158);
		memoPanel.add(textField);
		
		JTextPane memoTextPane = new JTextPane();
		memoTextPane.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		memoTextPane.setFocusTraversalPolicyProvider(true);
		memoTextPane.setBackground(new Color(255, 204, 204));
		memoTextPane.setAlignmentY(0.0f);
		memoTextPane.setAlignmentX(0.0f);
		memoTextPane.setBounds(0, 0, 49, 32);
		memoPanel.add(memoTextPane);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton.setBounds(163, 536, 150, 45);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}
}
