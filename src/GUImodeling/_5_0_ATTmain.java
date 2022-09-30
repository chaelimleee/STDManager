package GUImodeling;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class _5_0_ATTmain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_5_0_ATTmain frame = new _5_0_ATTmain();
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
	public _5_0_ATTmain() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel Title = new JLabel("출결관리");
		Title.setBounds(142, 33, 147, 27);
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		contentPane.add(Title);
		
		JButton btnNewButton = new JButton("출결조회");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton.setBounds(50, 88, 137, 47);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new _4_1_STDinsert();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("출결확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1.setBounds(246, 88, 137, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("스케쥴관리");
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_2.setBounds(50, 168, 137, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("학생정보수정");
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(246, 168, 137, 47);
		contentPane.add(btnNewButton_1_1);
	}

}
