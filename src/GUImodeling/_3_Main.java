package GUImodeling;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;

public class _3_Main extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public _3_Main() {
		run();
	}
	
	public void run() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title = new JLabel("학생관리의 정석");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(197, 21, 192, 40);
		Title.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		contentPane.add(Title);
		
		JButton btnNewButton = new JButton("오늘의 주요업무(창유지)");
		btnNewButton.setBounds(new Rectangle(3, 3, 0, 0));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new _2_TodayTask().run();
			}
		});
		btnNewButton.setBounds(401, 24, 179, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("학생관리");
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.LEADING);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1.setBounds(22, 126, 121, 53);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new _4_0_CareStudents().run();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("상담관리");
		btnNewButton_1_1.setHorizontalTextPosition(SwingConstants.LEADING);
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(313, 126, 121, 53);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("출결관리");
		btnNewButton_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1_2.setBounds(168, 126, 121, 53);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("결제관리");
		btnNewButton_1_3.setHorizontalTextPosition(SwingConstants.LEADING);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1_3.setBounds(459, 126, 121, 53);
		contentPane.add(btnNewButton_1_3);
		
		AdminBtn();
		setVisible(true);
	}

	void AdminBtn() {
		JButton AdminBtn = new JButton("관리자등록");
		AdminBtn.setBounds(511, 221, 96, 23);
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateAdmin().run();
			}
		});
		contentPane.add(AdminBtn);
	}
}
