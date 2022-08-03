package ig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1: ");
		lblNewLabel.setBounds(0, 28, 97, 28);
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(64, 32, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBounds(0, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(64, 64, 86, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(0, 214, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(64, 211, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 + num2;
				
				tfResultado.setText(""+resultado);
				
			}
		});
		btnNewButton.setBounds(235, 119, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subitracao");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 - num2;
				tfResultado.setText(""+resultado);
				
			}
		});
		btnNewButton_1.setBounds(335, 119, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplicacao");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 * num2;
				tfResultado.setText(""+resultado);
			}
		});
		btnNewButton_2.setBounds(238, 153, 86, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divisao");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				if (num2 < 0) {
					tfResultado.setText("Nao é possivel realizar essa divisao");
				} else {
					double resultado = num1 / num2;
					tfResultado.setText(""+resultado);
				}
			}
		});
		btnNewButton_3.setBounds(335, 153, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
