import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TicTacToe {

	private JFrame frame;
	Pannel p;
	JButton button_7;JButton button_6;JButton button_5;JButton button_4;JButton button_3;JButton button_2;JButton button_1;JButton button;JButton btnNewButton;
private JButton reset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}
	public void disable()
	{
		 button_7.setEnabled(false);
		 button_6.setEnabled(false);
		 button_5.setEnabled(false);
		 button_4.setEnabled(false);
		 button_3.setEnabled(false);
		 button_2.setEnabled(false);
		 button_1.setEnabled(false);
		 button.setEnabled(false);
		 btnNewButton.setEnabled(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		p=new Pannel();
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\programming\\java\\eclipse\\Tic Tac Toe\\bin\\logo.png"));
		frame.setBounds(100, 100, 347, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Play");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(28, 35, 39, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l = new JLabel("X turn");
		l.setForeground(Color.RED);
		l.setFont(new Font("Tahoma", Font.BOLD, 18));
		l.setBounds(86, 35, 132, 22);
		frame.getContentPane().add(l);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText(String.valueOf(Pannel.turn));
				btnNewButton.setEnabled(false);
				String s= p.setchar(0, 0);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
				}
				
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 51));
		btnNewButton.setBounds(10, 88, 93, 85);
		frame.getContentPane().add(btnNewButton);
		
		 button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setText(String.valueOf(Pannel.turn));
				button.setEnabled(false);
				String s= p.setchar(0, 1);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button.setBounds(125, 88, 93, 85);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setText(String.valueOf(Pannel.turn));
				button_1.setEnabled(false);
				String s= p.setchar(0, 2);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_1.setBounds(230, 88, 93, 85);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_2.setText(String.valueOf(Pannel.turn));
				button_2.setEnabled(false);
				String s= p.setchar(1, 0);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_2.setBounds(10, 193, 93, 85);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_3.setText(String.valueOf(Pannel.turn));
				button_3.setEnabled(false);
				String s= p.setchar(1, 1);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_3.setBounds(125, 193, 93, 85);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_4.setText(String.valueOf(Pannel.turn));
				button_4.setEnabled(false);
				String s= p.setchar(1, 2);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_4.setBounds(230, 193, 93, 85);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_5.setText(String.valueOf(Pannel.turn));
				button_5.setEnabled(false);
				String s= p.setchar(2, 0);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_5.setBounds(10, 288, 93, 85);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_6.setText(String.valueOf(Pannel.turn));
				button_6.setEnabled(false);
				String s= p.setchar(2, 1);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_6.setBounds(125, 288, 93, 85);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_7.setText(String.valueOf(Pannel.turn));
				button_7.setEnabled(false);
				String s= p.setchar(2, 2);
				if(s=="win")
				{
					l.setText(Pannel.turn+ " win");disable();
					 
				}
				else if (s=="tie") l.setText("Tie");else if (s=="notwin") l.setText(Pannel.turn + " trun");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 51));
		button_7.setBounds(230, 288, 93, 85);
		frame.getContentPane().add(button_7);
		
		reset = new JButton("R");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.reset();
				button_7.setEnabled(true);
				 button_6.setEnabled(true);
				 button_5.setEnabled(true);
				 button_4.setEnabled(true);
				 button_3.setEnabled(true);
				 button_2.setEnabled(true);
				 button_1.setEnabled(true);
				 button.setEnabled(true);
				 btnNewButton.setEnabled(true);
				 l.setText("X Turn");
				 button_7.setText("");
				 button_6.setText("");
				 button_5.setText("");
				 button_4.setText("");
				 button_3.setText("");
				 button_2.setText("");
				 button_1.setText("");
				 button.setText("");
				 btnNewButton.setText("");
			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD, 35));
		reset.setBounds(228, 10, 95, 68);
		frame.getContentPane().add(reset);
		
	}
}
