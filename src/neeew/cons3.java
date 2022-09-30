package neeew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import schedule.ScheduleVO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class cons3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Vector<ScheduleVO> vec;
	ScheduleVO vo;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTable table_1;
	private JPanel panel_3 ;
	private JScrollPane scrollpane ;
	private JTable table_2;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cons3 frame = new cons3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public cons3()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		테이블=====================================================<< 이래부터 월화수목금 테이블 생성 >>==============
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(12, 217, 795, 299);
		contentPane.add(panel_3);
		
		String []weekMain = {"월요일","화요일","수요일","목요일","금요일"};
		String [][]contents = {
				{"djWjrn","djWjrn","djWjrn","djWjrn","djWjrn"},
		};
		
		DefaultTableModel tableModel = new DefaultTableModel(contents,weekMain);
		panel_3.setLayout(null);
		table_2 = new JTable(tableModel);
		JScrollPane sc = new JScrollPane(table_2);
		sc.setBounds(0, 5, 795, 284);
		table_2.setRowHeight(100); // 테이블 세로 크기 설정
		panel_3.add(sc);
//		테이블=====================================================<<  위까지 월화수목금 테이블 생성 >>==============
		
		JLabel lblNewLabel = new JLabel("스케줄 관리");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(355, 10, 125, 33);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 174, 140, 33);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		String week[] = {"1주차", "2주차", "3주차", "4주차", "5주차"};
		
		JComboBox comboBox = new JComboBox(week);
		comboBox.setBounds(12, 10, 96, 23);
		panel_2.add(comboBox);
		
		JComboBox<String> combo;
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(677, 87, 132, 120);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		
		
		
		JButton btnNewButton_1 = new JButton("등록");
		btnNewButton_1.setBounds(12, 10, 105, 27);
		panel_4.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		
		JButton btnNewButton_1_1 = new JButton("수정");
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(12, 47, 105, 27);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("삭제");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(12, 84, 105, 27);
		panel_4.add(btnNewButton_1_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(25, 70, 303, 76);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(210, 189, 172));
		panel_1_1_1.setBounds(12, 48, 70, 23);
		panel_5.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1.setBounds(12, 0, 52, 23);
		panel_1_1_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 48, 121, 23);
		panel_5.add(textField_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(210, 189, 172));
		panel_1_1_1_1.setBounds(12, 10, 70, 23);
		panel_5.add(panel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setBounds(18, 0, 40, 23);
		panel_1_1_1_1.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(81, 10, 121, 23);
		panel_5.add(textField);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(214, 10, 77, 61);
		panel_5.add(btnNewButton);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		
		JLabel lblNewLabel_1 = new JLabel("학생 검색하기");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 53, 98, 22);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(340, 53, 335, 154);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(54, 37, 281, 117);
		panel.add(textArea);
		
		JLabel lblNewLabel_1_2 = new JLabel("메모");
		lblNewLabel_1_2.setBounds(54, 10, 66, 22);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
//		memoPanel=new JPanel();
//		memoPanel.setBorder(BorderFactory.createTitledBorder("Memo"));
//		memoArea = new JTextArea();
//		memoArea.setLineWrap(true);
//		memoArea.setWrapStyleWord(true);
//		memoAreaSP = new JScrollPane(memoArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		readMemo();
		
	}
}
