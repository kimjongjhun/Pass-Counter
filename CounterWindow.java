import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class CounterWindow extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	Variables v = new Variables();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CounterWindow frame = new CounterWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JButton btnHomePass;
	private JButton btnHomeMiss;
	private JButton btnAwayPass;
	private JButton btnAwayMiss;
	
	private JLabel lblNewLabel_HomeTeam;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;	
	private JLabel lblNewLabel_10;	
	private JLabel lblNewLabel_13;
	
	private JLabel lblNewLabel_AwayTeam;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_15;
	
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_Made;
	private JLabel lblNewLabel_Attempted;
	private JLabel lblNewLabel_Missed;
	private JLabel lblNewLabel_Completed;

	public CounterWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pass Counter");
		setBounds(100, 100, 640, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setResizable(false);

		JPanel header = new JPanel();
		header.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(header, BorderLayout.NORTH);

		JLabel lblPassCounterFor = DefaultComponentFactory.getInstance().createTitle("Pass Counter for Soccer");
		lblPassCounterFor.setFont(new Font("Arial", Font.BOLD, 24));
		header.add(lblPassCounterFor);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(panel, BorderLayout.SOUTH);

		btnHomePass = new JButton("Home Pass");
		panel.add(btnHomePass);
		btnHomePass.setHorizontalAlignment(SwingConstants.LEFT);
		btnHomePass.setFont(new Font("Arial", Font.PLAIN, 14));

		btnHomeMiss = new JButton("Home Miss");
		panel.add(btnHomeMiss);
		btnHomeMiss.setHorizontalAlignment(SwingConstants.LEFT);
		btnHomeMiss.setFont(new Font("Arial", Font.PLAIN, 14));

		btnAwayPass = new JButton("Away Pass");
		panel.add(btnAwayPass);
		btnAwayPass.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAwayPass.setFont(new Font("Arial", Font.PLAIN, 14));

		btnAwayMiss = new JButton("Away Miss");
		panel.add(btnAwayMiss);
		btnAwayMiss.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAwayMiss.setFont(new Font("Arial", Font.PLAIN, 14));

		JPanel main = new JPanel();
		main.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(main, BorderLayout.CENTER);
		main.setLayout(new GridLayout(5, 3, 0, 0));

		lblNewLabel_HomeTeam = new JLabel("HOME TEAM");
		lblNewLabel_HomeTeam.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_HomeTeam.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_HomeTeam);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_2);

		lblNewLabel_AwayTeam = new JLabel("AWAY TEAM");
		lblNewLabel_AwayTeam.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_AwayTeam.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_AwayTeam);

		lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_4);

		lblNewLabel_Made = new JLabel("MADE");
		lblNewLabel_Made.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_Made.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_Made);

		lblNewLabel_6 = new JLabel("0");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("0");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_7);

		lblNewLabel_Attempted = new JLabel("ATTEMPTED");
		lblNewLabel_Attempted.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_Attempted.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_Attempted);

		lblNewLabel_9 = new JLabel("0");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("0");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_10);

		lblNewLabel_Missed = new JLabel("MISSED");
		lblNewLabel_Missed.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_Missed.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_Missed);

		lblNewLabel_12 = new JLabel("0");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("0%");
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_13);

		lblNewLabel_Completed = new JLabel("COMPLETION");
		lblNewLabel_Completed.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_Completed.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_Completed);

		lblNewLabel_15 = new JLabel("0%");
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		main.add(lblNewLabel_15);

		btnAwayMiss.addActionListener(this);
		btnAwayPass.addActionListener(this);
		btnHomeMiss.addActionListener(this);
		btnHomePass.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == btnHomePass) {
			v.homeSuccess();
			v.calculateHome();
			lblNewLabel_4.setText(Integer.toString(v.getHomePass()));
			lblNewLabel_7.setText(Integer.toString(v.getHomeTotal()));
			lblNewLabel_13.setText(v.hc + "%");

		} else if (ae.getSource() == btnHomeMiss) {
			v.homeMiss();
			v.calculateHome();
			lblNewLabel_10.setText(Integer.toString(v.getHomeMiss()));
			lblNewLabel_7.setText(Integer.toString(v.getHomeTotal()));
			lblNewLabel_13.setText(v.hc + "%");

		} else if (ae.getSource() == btnAwayPass) {
			v.awaySuccess();
			v.calculateAway();
			lblNewLabel_6.setText(Integer.toString(v.getAwayPass()));
			lblNewLabel_9.setText(Integer.toString(v.getAwayTotal()));
			lblNewLabel_15.setText(v.ac + "%");

		} else {
			v.awayMiss();
			v.calculateAway();
			lblNewLabel_12.setText(Integer.toString(v.getAwayMiss()));
			lblNewLabel_9.setText(Integer.toString(v.getAwayTotal()));
			lblNewLabel_15.setText(v.ac + "%");

		}
	}

}
