package Questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Planeta extends JFrame {
	
	JFrame tela =  new JFrame("Calculo de Peso");
	
	JLabel lbtexto1 = new JLabel("Peso na Terra (kg):");
	JLabel lbtexto2 = new JLabel("Selecione o Planeta:");
	
	JTextField tx = new JTextField();
	
	JButton btncalcula = new JButton("Calcular Peso");
	
	ButtonGroup grupo = new ButtonGroup();
	JRadioButton mercurio = new JRadioButton("Mércurio", false);
	JRadioButton marte = new JRadioButton("Marte", false);
	JRadioButton urano = new JRadioButton("Urano", false);
	JRadioButton saturno = new JRadioButton("Saturno", false);
	JRadioButton venus = new JRadioButton("Venus", false);
	JRadioButton jupter = new JRadioButton("Jupter", false);
	
	private float peso;
	private float pesoPlaneta;
	
	public Planeta() {
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setLayout(null);
		tela.setSize(400, 300);
		
		
		tela.getContentPane().add(lbtexto1);
		lbtexto1.setBounds(50, 30, 140, 40);
		
		tela.getContentPane().add(tx);
		tx.setBounds(50, 70, 110, 20);
		
		tela.getContentPane().add(lbtexto2);
		lbtexto2.setBounds(50, 90, 140, 40);
	
		grupo.add(jupter);grupo.add(marte);grupo.add(urano);
		grupo.add(saturno);grupo.add(mercurio);grupo.add(venus);
		
		tela.getContentPane().add(mercurio);
		mercurio.setBounds(40, 130, 80, 30);
		
		tela.getContentPane().add(jupter);
		jupter.setBounds(160, 130, 80, 30);
		
		tela.getContentPane().add(marte);
		marte.setBounds(250, 130, 80, 30);
		
		tela.getContentPane().add(urano);
		urano.setBounds(40, 160, 80, 30);
		
		tela.getContentPane().add(saturno);
		saturno.setBounds(160, 160, 80, 30);
		
		tela.getContentPane().add(venus);
		venus.setBounds(250, 160, 80, 30);
		
		tela.getContentPane().add(btncalcula);
		btncalcula.setBounds(200, 70, 120, 20);
		
		btncalcula.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent calcular) {
				
				peso = Float.parseFloat(tx.getText());
				
				if(mercurio.isSelected()) {
					pesoPlaneta = (float) (peso * 0.37);
					JOptionPane.showMessageDialog(null, "Seu Peso em Merúrio é: " + pesoPlaneta + "Kg");
				} else if (venus.isSelected()) {
					pesoPlaneta = (float) (peso * 0.88);
					JOptionPane.showMessageDialog(null, "Seu Peso em Vênus é: " + pesoPlaneta + "Kg");
				}else if (marte.isSelected() ) {
					pesoPlaneta = (float) (peso * 0.38);
					JOptionPane.showMessageDialog(null, "Seu Peso em Marte é: " + pesoPlaneta + "Kg");
				}else if (jupter.isSelected()) {
					pesoPlaneta = (float) (peso * 2.64);
					JOptionPane.showMessageDialog(null, "Seu Peso em Júpter é: " + pesoPlaneta + "Kg");
				}else if (saturno.isSelected()) {
					pesoPlaneta = (float) (peso * 1.15);
					JOptionPane.showMessageDialog(null, "Seu Peso em Saturno é: " + pesoPlaneta + "Kg");
				}else if (urano.isSelected()) {
					pesoPlaneta = (float) (peso * 1.17);
					JOptionPane.showMessageDialog(null, "Seu Peso em Urâno é: " + pesoPlaneta + "Kg");
				}
			}
		});
		
	}
	public static void main(String[] args) {
		Planeta planeta = new Planeta();
	}

}
