package GUImodeling;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import Attendance.AttendanceUtil;
import Attendance.AttendanceVO;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class _5_1_ATTsearch extends JFrame {
	
	private String name;
	private String phone;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField phoneField;
	private JTable table_1;
	private JPanel panel_2;
	private JPanel panel;
	JButton SearchBtn;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	Vector<AttendanceVO> vec;
//	private JCheckBox chkBox1, chkBox2, chkBox3, chkBox4, chkBox5, chkBox6, chkBox7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_5_1_ATTsearch frame = new _5_1_ATTsearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void searchBtn() {
		JButton SearchBtn = new JButton("조회");
		SearchBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		SearchBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		SearchBtn.setBounds(566, 21, 78, 73);
		SearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {		
				read();
				setVisible(true);
			}
		});	
		panel.add(SearchBtn);
	}
	
	public void chk() {
//		if(name.length())
	}
	
	public void read() {
		name=nameField.getText();
		phone=phoneField.getText();
	}
	
	public _5_1_ATTsearch() throws SQLException {
		vec=new AttendanceUtil().selectAll();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 696, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Title = new JLabel("출석조회");
		Title.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(297, 10, 80, 27);
		contentPane.add(Title);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(12, 56, 656, 115);
		contentPane.add(MainPanel);
		MainPanel.setLayout(null);
		
		SearchBtn = new JButton("조회");
		SearchBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		SearchBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		SearchBtn.setBounds(566, 21, 78, 73);
		SearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {		
				read();
				setVisible(true);
			}
		});	
		MainPanel.add(SearchBtn);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(255, 193, 193));
		namePanel.setBounds(12, 10, 206, 37);
		MainPanel.add(namePanel);
		namePanel.setLayout(null);
		
		nameField = new JTextField();
		nameField.setBounds(51, 0, 155, 37);
		namePanel.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 51, 37);
		namePanel.add(lblNewLabel_1);
		
		JPanel PhonePanel = new JPanel();
		PhonePanel.setLayout(null);
		PhonePanel.setBackground(new Color(255, 193, 193));
		PhonePanel.setBounds(276, 10, 224, 37);
		MainPanel.add(PhonePanel);
		
		phoneField = new JTextField();
		phoneField.setColumns(10);
		phoneField.setBounds(69, 0, 155, 37);
		PhonePanel.add(phoneField);
		
		JLabel lblNewLabel_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(0, 0, 68, 37);
		PhonePanel.add(lblNewLabel_1_1);
		
		JPanel filterPanel = new JPanel();
		filterPanel.setBounds(12, 73, 224, 32);
		MainPanel.add(filterPanel);
		filterPanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("조회주차");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(12, 5, 62, 22);
		filterPanel.add(lblNewLabel_3);
		
		String[] week = {"이번달","1주차","2주차","3주차","4주차","5주차"};
		comboBox = new JComboBox(week);
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		
		comboBox.setBounds(74, 0, 62, 32);
		filterPanel.add(comboBox);
		
		panel_2 = new JPanel();
		panel_2.setBounds(12, 203, 656, 459);
		contentPane.add(panel_2);
		
		tableSet(vec);
		
	}
	
	public void tableSet(Vector<AttendanceVO> vec) throws SQLException {
		String [] header = {"이름","날짜","1교시","2교시","3교시","4교시","5교시","6교시","7교시","출석률"};
//		Object [][]contents= {{"김예지","2022/09/28","출석","출석","출석","출석","출석","출석","출석",100+"%"}};		

		//이부분 vector 조건 변경하도록 수정 
		Object [][]contents= contents(vec);
		
		panel_2.setLayout(null);
		table_1 = new JTable(contents,header);
		table_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));	
		table_1.setPreferredScrollableViewportSize(new Dimension(700,600));
		table_1.setFillsViewportHeight(true);
		table_1.setBounds(12, 203, 656, 459);
		JScrollPane scrollpane = new JScrollPane(table_1);
		scrollpane.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		scrollpane.setBackground(new Color(255, 172, 172));
		scrollpane.setBounds(0, 0, 656, 459);
		panel_2.add(scrollpane);
	}
	
	//출결전체
	public Object[][] contents(Vector<AttendanceVO> vec) throws SQLException{
		int i =2,j = 0;
		int isAttend=0;
		Object[][] oj = new Object[new AttendanceUtil().stdAttCnt()][10];
		for(AttendanceVO vo:vec) {
			oj[j][i]=vo.getReason();
			if(vo.getIsAttend()==1) isAttend++;
			i++;
			if(i%9==0) {
				oj[j][0]=vo.getName();
				oj[j][1]=vo.getDay();
				oj[j][9]= isAttend/7*100 +"%";
				j++; i=2;
			}
		}
		return oj;
	}
}
