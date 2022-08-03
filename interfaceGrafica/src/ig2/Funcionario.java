package ig2;

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

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCargo;
	private JTextField tfSalario;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(30, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel iblNew = new JLabel("Cargo:");
		iblNew.setBounds(30, 47, 46, 14);
		contentPane.add(iblNew);
		
		JLabel lblNewLabel_2 = new JLabel("Salario:");
		lblNewLabel_2.setBounds(30, 72, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfNome = new JTextField();
		tfNome.setBounds(70, 19, 148, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setBounds(70, 44, 148, 20);
		contentPane.add(tfCargo);
		tfCargo.setColumns(10);
		
		tfSalario = new JTextField();
		tfSalario.setBounds(70, 72, 148, 20);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("Aumentar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					 sal = salario *1.3;
				} else if (salario <= 2000) {
					sal = salario * 1.2;
				} else {
					sal = salario * 1.1;
				}
				
				tfResultado.setText(""+nome+"\nCargo: "+cargo+"\n Salario: R$"+sal);
				
			}
		});
		btnNewButton.setBounds(30, 103, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Diminuir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String nome= tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario *0.9;
				} else if (salario <= 2000) {
					sal = salario * 0.8;
				} else {
					sal = salario * 0.7;
				}
				
				tfResultado.setText(""+nome+" Cargo: "+cargo+" Novo Salario: R$"+sal);
				
			}
		});
		btnNewButton_1.setBounds(129, 103, 89, 23);
		contentPane.add(btnNewButton_1);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(30, 137, 394, 102);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
	}

}
