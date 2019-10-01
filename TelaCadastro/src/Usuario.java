import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Usuario extends JFrame{

	//Frame\\
	JFrame tela = new JFrame("Cadastro de Pessoas");
	
	//Botoes\\
	JButton botao1 = new JButton("Confirmar");
	JButton botao2 = new JButton("Cancelar");
	
	//ComboBox\\
	JComboBox selecaoSalario = new JComboBox();
	
	//JRadio\\
	JRadioButton m = new JRadioButton("MASCULINO");
	JRadioButton f = new JRadioButton("FEMININO");
	
	//Textfield\\
	JTextField tfnome = new JTextField();
	JTextField tffone = new JTextField();
	JTextField tfemail = new JTextField();
	JTextField tfcpf = new JTextField();
	
	//Labels\\
	JLabel lbNome = new JLabel("NOME: ");
	JLabel lbCpf = new JLabel("CPF: ");
	JLabel lbSexo = new JLabel("SEXO: ");
	JLabel lbFone = new JLabel("TELEFONE: ");
	JLabel lbEmail = new JLabel("E-MAIL: ");
	JLabel inicio = new JLabel("Cadastro de Pessoas");
	JLabel sal = new JLabel("FAIXA SALARIAL: ");
	JLabel label = new JLabel(new ImageIcon(getClass().getResource("icone_verde.png")));
	
	//Construtor\\
	public Usuario() {
				
		//Configurações da Tela\\
		tela.setSize(370,500);
		tela.setVisible(true);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		//Adcionando e Setando Posiçoes dos Componentes\\
		tela.getContentPane().add(label); 
		label.setBounds(20, 30, 132, 138);
				
		tela.getContentPane().add(inicio);
		inicio.setFont(new Font("Tahoma", Font.BOLD,16)); 
		inicio.setBounds(170, 95, 180, 20);
		
		tela.getContentPane().add(lbNome);
		lbNome.setBounds(15, 165, 50, 50);
		tela.getContentPane().add(tfnome);  
		tfnome.setBounds(15, 200, 325, 20);
		
		tela.getContentPane().add(lbCpf);  
		lbCpf.setBounds(15, 215, 50, 50);
		tela.getContentPane().add(tfcpf);  
		tfcpf.setBounds(15, 250, 130, 20);
		
		tela.getContentPane().add(lbSexo);  
		lbSexo.setBounds(15, 330, 110, 18);
		tela.getContentPane().add(m);   
		m.setBounds(100, 330, 110, 18);
		tela.getContentPane().add(f);  
		f.setBounds(220, 330, 110, 18);

		tela.getContentPane().add(lbFone);   
		lbFone.setBounds(200, 215, 70, 50);
		tela.getContentPane().add(tffone);  
		tffone.setBounds(200, 250, 140, 20);
		
		tela.getContentPane().add(lbEmail); 
		lbEmail.setBounds(15, 265, 50, 50);
		tela.getContentPane().add(tfemail);  
		tfemail.setBounds(15, 300, 325, 20);
		
		tela.getContentPane().add(sal);
		sal.setBounds(15, 350, 200, 50);
		tela.getContentPane().add(selecaoSalario);
		selecaoSalario.setBounds(140, 365, 130, 25);
		selecaoSalario.addItem("1 a 3 Salários");
		selecaoSalario.addItem("3 a 5 Salários");
		selecaoSalario.addItem("Acima de 5 Salários");
		
		tela.getContentPane().add(botao1);  
		botao1.setBounds(80, 420, 110, 18);
		
		tela.getContentPane().add(botao2);  
		botao2.setBounds(200, 420, 110, 18);
		
		botao1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent confirmar) {
				String guardaTexto1 = tfnome.getText();
				String guardaTexto2 = tfcpf.getText();
				String guardaTexto3 = tffone.getText();
				String guardaTexto4 = tfemail.getText();
				String guardaTexto5 = m.getText();//pegar o texto
				String guardaTexto6 = f.getText();
				String guardaTexto7 = (String) selecaoSalario.getSelectedItem();// pegar texto de comboBox
				
				if(m.isSelected()) {//saber qual opcao do JRadioButton foi selecionada
				 JOptionPane.showMessageDialog(null, guardaTexto1 + "\n" + guardaTexto2 + "\n" + guardaTexto5 + "\n" + guardaTexto3 + "\n" + guardaTexto4 + "\n" + guardaTexto7);
				} else if (f.isSelected()){
					JOptionPane.showMessageDialog(null, guardaTexto1 + "\n" + guardaTexto2 + "\n" + guardaTexto6 + "\n" + guardaTexto3 + "\n" + guardaTexto4 + "\n" + guardaTexto7);
				}
			}
		});
		
		botao2.addActionListener(new ActionListener() {  
			
			public void actionPerformed(ActionEvent sair) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		Usuario novo = new Usuario();
	}

}

