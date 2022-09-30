package neeew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Att extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Att frame = new Att();
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
	public Att() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("출결 체크");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(440, 20, 94, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 67, 636, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(94, 10, 142, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름  : ");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(23, 10, 72, 31);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(335, 10, 142, 31);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("전화번호  : ");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(248, 10, 88, 31);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(509, 12, 115, 27);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(23, 139, 964, 126);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		String []weekMain = {"학생번호","이름","나이","성별","전화번호","주소","메모"
				,"이용종료일","패널티","관리시작일","관리종료일","출석률"};
//		String [][]contents = {
//				{"djWjrn","djWjrn","djWjrn","djWjrn","djWjrn"},
//		};
		Object [][]contents= contents(vec);
//		
		DefaultTableModel tableModel = new DefaultTableModel(contents,weekMain);
		//table = new JTable(tableModel);
		//table.setBounds(0, 10, 952, 92);
		panel_2.add(table);
		panel_2.setLayout(null);
		table = new JTable(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane sc = new JScrollPane(table);
		sc.setBounds(0, 5, 952, 111);
//		table.setRowHeight(100); // 테이블 세로 크기 설정
		panel_2.add(sc);
	}

}
