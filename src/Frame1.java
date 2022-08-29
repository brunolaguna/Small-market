import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class Frame1 {

	private double preco, preco1, preco2, preco3, preco4, preco5, preco6, res;
	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("CheckBox.background"));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setTitle("Mercadinho");
		frame.setBounds(200, 200, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		
		JButton botao = new JButton("Comprar");
		botao.setBounds(64, 218, 122, 23);
		frame.getContentPane().add(botao);
		
		JLabel lblNewLabel = new JLabel("Produtos");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel.setBounds(22, 0, 82, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox checkboxCenoura = new JCheckBox("Cenoura");
		checkboxCenoura.setBounds(22, 58, 97, 23);
		frame.getContentPane().add(checkboxCenoura);
		
		JCheckBox checkboxCebola = new JCheckBox("Cebola");
		checkboxCebola.setBounds(22, 84, 97, 23);
		frame.getContentPane().add(checkboxCebola);
		
		JCheckBox checkboxBeterraba = new JCheckBox("Beterraba");
		checkboxBeterraba.setBounds(22, 110, 97, 23);
		frame.getContentPane().add(checkboxBeterraba);
		
		JCheckBox checkboxPepino = new JCheckBox("Pepino");
		checkboxPepino.setBounds(22, 136, 97, 23);
		frame.getContentPane().add(checkboxPepino);
		
		JCheckBox checkboxPimentao = new JCheckBox("Pimentão");
		checkboxPimentao.setBounds(22, 162, 97, 23);
		frame.getContentPane().add(checkboxPimentao);
		
		JCheckBox checkboxTomate = new JCheckBox("Tomate");
		checkboxTomate.setBounds(22, 188, 97, 23);
		frame.getContentPane().add(checkboxTomate);
		
		JLabel lblNewLabel_1 = new JLabel("Valor");
		lblNewLabel_1.setBounds(189, 0, 82, 23);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox checkboxBatata = new JCheckBox("Batata");
		checkboxBatata.setBounds(22, 32, 97, 23);
		frame.getContentPane().add(checkboxBatata);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade(kg)");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_2.setBounds(297, 2, 127, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("R$ 1,50");
		lblNewLabel_3.setBounds(189, 34, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("R$ 2,50");
		lblNewLabel_4.setBounds(189, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("R$ 2,50");
		lblNewLabel_5.setBounds(189, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("R$ 2,00");
		lblNewLabel_6.setBounds(189, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("R$ 1,50");
		lblNewLabel_7.setBounds(189, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("R$ 3,00");
		lblNewLabel_8.setBounds(189, 166, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("R$ 3,00");
		lblNewLabel_9.setBounds(189, 192, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(297, 59, 115, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(297, 85, 115, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(297, 111, 115, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(297, 137, 115, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(297, 163, 115, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(297, 189, 115, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(130, 266, 154, 22);
		frame.getContentPane().add(textArea);
		textArea.setEditable(false);
		
		JButton btnNewButton = new JButton("Limpar calculo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				checkboxCenoura.setSelected(false);
				checkboxCebola.setSelected(false);
				checkboxBatata.setSelected(false);
				checkboxBeterraba.setSelected(false);
				checkboxPepino.setSelected(false);
				checkboxPimentao.setSelected(false);
				checkboxTomate.setSelected(false);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textArea.setText(null);
				preco = 0;
			}
		});
		btnNewButton.setBounds(241, 218, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_7 = new JTextField();
		textField_7.setBounds(297, 32, 115, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
						if(checkboxCenoura.isSelected()) 
						{
							Double n = Double.parseDouble(textField_1.getText());
							preco = 2.50 * n;
						}
						else
						{
							preco = 0;
						}
					
						if(checkboxCebola.isSelected()) 
						{
							preco1 = 2.50 * Double.parseDouble(textField_2.getText());
						}
						else
						{
							preco1 = 0;
						}
					
						if(checkboxBatata.isSelected()) 
						{
							preco2 = 1.50 * Double.parseDouble(textField_7.getText());
						}
						else
						{
							preco2 = 0;
						}
					
						if(checkboxBeterraba.isSelected()) 
						{
							preco3 = 2.00 * Double.parseDouble(textField_3.getText());
						}
						else
						{
							preco3 = 0;
						}
					
						if(checkboxPepino.isSelected()) 
						{
							preco4 = 1.50 * Double.parseDouble(textField_4.getText());
						}
						else
						{
							preco4 = 0;
						}
					
						if(checkboxPimentao.isSelected()) 
						{
							preco5 = 3.00 * Double.parseDouble(textField_5.getText());
						}
						else
						{
							preco5 = 0;
						}
					
						if(checkboxTomate.isSelected()) 
						{
							preco6 = 3.00 * Double.parseDouble(textField_6.getText());
						}
						else
						{
							preco6 = 0;
						}
					
					}	catch(NumberFormatException erro) {
						JOptionPane.showMessageDialog(null, "Por favor, digitar a quantidade de produtos selecionados.");
				}
					res = preco + preco1 + preco2 + preco3 + preco4 + preco5 + preco6;
					String s = String.valueOf(res);
				
					System.out.println(s);
					if(res == 0) 
					{
						textArea.setText("");
						JOptionPane.showMessageDialog(null, "Por favor, selecione algum produto.");
					}
					else 
					{
						textArea.setText("Total à pagar ".concat(s) + " reais");
					}
				}
		});
	}
}
		
	

			
	

