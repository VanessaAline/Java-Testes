import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Camisa extends JFrame {
	
	
	private JFrame tela = new JFrame();
	
	private JLabel lbmat = new JLabel("MATRÍCULA");
	private JLabel lbtamanho = new JLabel("TAMANHO DA CAMISA");
	private JLabel lbcor = new JLabel("SELECIONE A COR DA CAMISA:");
	private JLabel lbcorSelecionada = new JLabel();
	private JLabel lbqtd = new JLabel("QUANTIDADE DE CAMISAS");
	/*private JLabel lbbranca = new JLabel(iconBranca);
	private JLabel lbazul = new JLabel(iconAzul);
	private JLabel lbvermelha = new JLabel(iconVermelha);
	private JLabel lbverde = new JLabel(iconVerde);
	private JLabel lbamarela = new JLabel(iconAmarela);*/
	
	/*private ImageIcon iconBranca = new ImageIcon(getClass().getResource("white.png"));
	private ImageIcon iconAzul = new ImageIcon(getClass().getResource("blue.png"));
	private ImageIcon iconAmarela = new ImageIcon(getClass().getResource("yellow.png"));
	private ImageIcon iconVerde = new ImageIcon(getClass().getResource("green.png"));
	private ImageIcon iconVermelha = new ImageIcon(getClass().getResource("red.png"));*/
	
	private JTextField txtmatricula = new JTextField();
	private JTextField txtquantidade = new JTextField();
	
	private JComboBox<String> combo = new JComboBox<String>();
	private JButton btsolicitar = new JButton("ENVIAR");
	
	private String corCamisa;
	private int matricula;
	private int quantidade;
	private String tamanho;
	
	//Construtor
	public Camisa() {
		
		//Configuraca da tela
		tela.setLayout(null);
		tela.setVisible(true);
		tela.setSize(330, 480);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().add(lbmat);
		tela.getContentPane().add(lbtamanho);
		tela.getContentPane().add(lbcor);
		tela.getContentPane().add(lbqtd);
		tela.getContentPane().add(txtmatricula);
		tela.getContentPane().add(txtquantidade);
		tela.getContentPane().add(combo);
		tela.getContentPane().add(btsolicitar);
		
		/*lbbranca.setBounds(465,230,60,30);
		lbazul.setBounds(365,230,60,30);
		lbverde.setBounds(265,230,60,30);
		lbamarela.setBounds(165,230,60,30);
		lbvermelha.setBounds(65,230,60,30);*/
			
		lbmat.setVisible(true);
		lbmat.setBounds(45,80,150,50);
		lbmat.setFont(new Font("Tahoma", 1, 12));
		
		lbtamanho.setBounds(45,150,250,30);
	    lbtamanho.setFont(new Font("Tahoma", 1, 12));
	    
		lbcor.setBounds(45,240,250,30);
		lbcor.setFont(new Font("Tahoma", 1, 12));

		lbqtd.setBounds(45,185,200,50);
		lbqtd.setFont(new Font("Tahoma", 1, 12));
		
		txtmatricula.setBounds(170,100,80,20);
		txtquantidade.setBounds(210,200,40,20);
		
		btsolicitar.setBounds(50,370,200,30);
		btsolicitar.setFont(new Font("Tahoma", 1, 18));
		
		combo.setBounds(200,140,50,30);
		combo.addItem(null);
		combo.addItem("P");
		combo.addItem("M");
		combo.addItem("G");		
		
		/*EM CONSTRUÇÃO*/
	}
	public static void main(String[] args) {
		Camisa escolha = new Camisa();

	}

}
