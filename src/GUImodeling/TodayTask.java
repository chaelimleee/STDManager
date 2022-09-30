package GUImodeling;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ETC.DateTime;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class TodayTask extends JFrame {
	
	private JPanel contentPane;
	  
	/**
	 * Create the frame.
	 */
	public TodayTask() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 730);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void run() {
		title();
		Attendance();
		Consult();
		finish();
		mainbtn();		
		setVisible(true);
	}
	
	//타이틀
	void title() {
		JLabel todayTask = new JLabel("오늘의 주요 업무");
		todayTask.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		todayTask.setBounds(239, 40, 134, 40);
		contentPane.add(todayTask);		
		JLabel todayTask_1 = new JLabel(DateTime.today()+" "+DateTime.DayOfWeek(DateTime.findDayOfWeek()));
		todayTask_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		todayTask_1.setBounds(203, 10, 202, 40);
		contentPane.add(todayTask_1);
	}
	
	//출결특이사항
	void Attendance() {
		JPanel panel = new JPanel();
		panel.setFocusable(false);
		panel.setBounds(32, 79, 522, 152);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 210, 210));
		panel_2.setBounds(0, 0, 522, 29);
		panel.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("출결 특이사항");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(231, 231, 231));
		panel_1.setBounds(0, 28, 522, 29);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학생");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(24, 10, 36, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("번호");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(136, 10, 36, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("특이사항");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(347, 10, 74, 15);
		panel_1.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(0, 56, 522, 96);
		panel.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(505, 56, 17, 96);
		panel.add(scrollBar);
	}
	
	//상담일정
	void Consult() {
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setFocusable(false);
		panel_3.setBounds(32, 257, 522, 152);
		contentPane.add(panel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(231, 231, 231));
		panel_1_1.setBounds(0, 28, 522, 29);
		panel_3.add(panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("학생");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(25, 10, 36, 15);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("상담시간");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(118, 10, 55, 15);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("담당 교수님");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(244, 10, 74, 15);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("메모");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(424, 10, 36, 15);
		panel_1_1.add(lblNewLabel_1_2);
		
		JList list_1 = new JList();
		list_1.setBounds(0, 56, 522, 96);
		panel_3.add(list_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(505, 56, 17, 96);
		panel_3.add(scrollBar_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 210, 210));
		panel_2_1.setBounds(0, 0, 522, 29);
		panel_3.add(panel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("상담일정");
		lblNewLabel_3_1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		panel_2_1.add(lblNewLabel_3_1);
	}
	
	//학습종료임박
	void finish() {
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setFocusable(false);
		panel_4.setBounds(32, 432, 522, 152);
		contentPane.add(panel_4);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(255, 210, 210));
		panel_2_2.setBounds(0, 0, 522, 29);
		panel_4.add(panel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("학습종료임박(재등록유도)");
		lblNewLabel_3_2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		panel_2_2.add(lblNewLabel_3_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(231, 231, 231));
		panel_1_2.setBounds(0, 28, 522, 29);
		panel_4.add(panel_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("학생");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(43, 10, 36, 15);
		panel_1_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_3 = new JLabel("번호");
		lblNewLabel_1_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(155, 10, 36, 15);
		panel_1_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("학습종료 만료일");
		lblNewLabel_2_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(347, 10, 105, 15);
		panel_1_2.add(lblNewLabel_2_2);
		
		JList list_2 = new JList();
		list_2.setBackground(Color.WHITE);
		list_2.setBounds(0, 56, 522, 96);
		panel_4.add(list_2);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(505, 56, 17, 96);
		panel_4.add(scrollBar_2);
	}
	
	//메인가는 버튼
	void mainbtn() {
		JButton btnNewButton = new JButton("메인화면");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton.setBounds(226, 612, 140, 51);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				dispose();
				new Main();
			}
		});	
		contentPane.add(btnNewButton);
	}
}
