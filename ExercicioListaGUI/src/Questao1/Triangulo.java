package Questao1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Triangulo extends JFrame{
	
	JFrame tela = new JFrame("Tipos de Triangulos");
	
	JLabel lado1 = new JLabel("Lado 1: ");
	JLabel lado2 = new JLabel("Lado 2: ");
	JLabel lado3 = new JLabel("Lado 3: ");
	
	JLabel result = new JLabel("Seu Triangulo é...");
	
	JTextField tx1 = new JTextField();
	JTextField tx2 = new JTextField();
	JTextField tx3 = new JTextField();
	
	JButton botao = new JButton("Verificar Tipo");
	
	
	//Construtor\\
	public Triangulo() {
					
		//Configurações da Tela\\
		tela.setSize(500,300);
		tela.setVisible(true);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		//Labels\\
		tela.getContentPane().add(lado1);
		lado1.setBounds(50, 50, 80, 40);
		tela.getContentPane().add(lado2);
		lado2.setBounds(50, 100, 80, 40);
		tela.getContentPane().add(lado3);
		lado3.setBounds(50, 150, 80, 40);
		tela.getContentPane().add(result);
		result.setBounds(300, 100, 150, 40);
		
		//TextFields\\
		tela.getContentPane().add(tx1);
		tx1.setBounds(100, 60, 100, 20);
		tela.getContentPane().add(tx2);
		tx2.setBounds(100, 110, 100, 20);
		tela.getContentPane().add(tx3);
		tx3.setBounds(100, 160, 100, 20);
		
		//Botao\\
		tela.getContentPane().add(botao);
		botao.setBounds(50, 200, 150, 20);
		botao.setVisible(true);
		
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent verificar) {
				Integer valor1 = Integer.parseInt(tx1.getText());
				Integer valor2 = Integer.parseInt(tx2.getText());
				Integer valor3 = Integer.parseInt(tx3.getText());
				
				if(valor1 == valor2 && valor1 == valor3 && valor2 == valor3) {
					result.setText("Triângulo Equilátero");
				} else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
					result.setText("Triângulo Isóceles");
				} else {
					result.setText("Triângulo Escaleno");
				}
			}
		});
		
		
		
	}
	
	
	public static void main(String[] args) {
		Triangulo teste = new Triangulo();

	}

}
