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

@SuppressWarnings("serial")
public class CareStudents extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CareStudents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
	}
	public void run() {
		JLabel Title = new JLabel("학생관리");
		Title.setBounds(142, 33, 147, 27);
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		contentPane.add(Title);
		
		JButton btnNewButton = new JButton("학생등록");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton.setBounds(50, 88, 137, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("학생조회");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1.setBounds(246, 88, 137, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("학생등록삭제");
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_2.setBounds(50, 168, 137, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("학생정보수정");
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(246, 168, 137, 47);
		contentPane.add(btnNewButton_1_1);
		setVisible(true);
	}
}
