package GUImodeling;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class AttSelect extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttSelect frame = new AttSelect();
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
	public AttSelect() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 696, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("출석조회");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(297, 10, 80, 27);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 56, 656, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton.setBounds(566, 21, 78, 73);
		panel.add(btnNewButton);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(255, 193, 193));
		namePanel.setBounds(12, 10, 206, 37);
		panel.add(namePanel);
		namePanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(51, 0, 155, 37);
		namePanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 51, 37);
		namePanel.add(lblNewLabel_1);
		
		JPanel PhonePanel = new JPanel();
		PhonePanel.setLayout(null);
		PhonePanel.setBackground(new Color(255, 193, 193));
		PhonePanel.setBounds(276, 10, 224, 37);
		panel.add(PhonePanel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(69, 0, 155, 37);
		PhonePanel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(0, 0, 68, 37);
		PhonePanel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 73, 434, 32);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("조회기간");
		lblNewLabel_3.setBounds(0, 4, 62, 22);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(53, 0, 149, 32);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("~");
		lblNewLabel_2.setBounds(208, 6, 33, 20);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(240, 0, 149, 32);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 203, 656, 459);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(12, 203, 656, 459);
		contentPane.add(table_1);
		

	}
}
