import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class JokeyPow extends JFrame{

	//Frame
	JFrame tela = new JFrame("Pedra,Papel,Tesoura");
	
	//Botoes
	JButton botao1 = new JButton("Jogar");
	JButton botao2 = new JButton("Sair");
	
	//JRadioButton
	JRadioButton Jpedra = new JRadioButton("Pedra", false);
	JRadioButton Jpapel = new JRadioButton("Papel", false);
	JRadioButton Jtesoura = new JRadioButton("Tesoura", false);
	
	//Variaveis
	private int jogador;
	private int pc;
	
	//Labels
	private JLabel result = new JLabel("RESULTADO");
	private JLabel lbmaquina = new JLabel("A MÁQUINA ESCOLHEU");
	private JLabel status = new JLabel();
	
	//Construtor
	public JokeyPow(){
		
	//Configuracoes Da Tela
	tela.setSize(500,500);
	tela.setVisible(true);
	tela.setLayout(null);
	tela.setResizable(false);
	tela.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	
	//Adcionando Componentes a Tela
	tela.getContentPane().add(Jpedra);
	Jpedra.setBounds(80, 320, 100, 18);
	Jpedra.setFont(new Font("Tahoma", 1, 18));
		
	tela.getContentPane().add(Jpapel);
	Jpapel.setBounds(190, 320, 100, 18);
	Jpapel.setFont(new Font("Tahoma", 1, 18));
		
	tela.getContentPane().add(Jtesoura);
	Jtesoura.setBounds(300, 320, 100, 18);
	Jtesoura.setFont(new Font("Tahoma", 1, 18));
		
	tela.getContentPane().add(result);
	result.setBounds(180, 200, 200, 25);
	result.setFont(new Font("Tahoma", 1, 18));
	
	tela.getContentPane().add(lbmaquina);
	lbmaquina.setBounds(130, 40, 280, 25);
	lbmaquina.setFont(new Font("Tahoma", 1, 18));
	
	tela.getContentPane().add(status);
	status.setBounds(200, 70, 200, 25);
	status.setFont(new Font("Tahoma", 1, 18));
	
	tela.getContentPane().add(botao1);  
	botao1.setBounds(125, 420, 110, 18);
	botao1.setFont(new Font("Tahoma", 1, 15));
		
	tela.getContentPane().add(botao2);
	botao2.setBounds(245, 420, 110, 18);
	botao2.setFont(new Font("Tahoma", 1, 15));
	
	//Acoes dos Botoes
	botao1.addActionListener(new ActionListener() {  
		
		public void actionPerformed(ActionEvent jogar) {
			
			int pc = (int)(Math.random()*3);			
			
			/*Escolha entre 0, 1 e 2 , sendo : 
			 * 
			 * Pedra = 0 
			 * 
			 * Papel = 1 
			 * 
			 * Tesoura = 2
			 */
			
			
			//papel x pedra
			if(Jpapel.isSelected() && pc == 0) {
				result.setText("VOCÊ GANHOU");
				status.setText("PEDRA");
				
			//pedra x tesoura
			} else if(Jpedra.isSelected() && pc == 2) {
				result.setText("VOCÊ GANHOU");
				status.setText("TESOURA");			
			
			//tesoura x papel
			}else if(Jtesoura.isSelected() && pc == 1) {
				result.setText("VOCÊ GANHOU");
				status.setText("PAPEL");
				
			//pedra x pedra	
			}else if(Jpedra.isSelected() && pc == 0) {
				result.setText("EMPATE");
				status.setText("PEDRA");
			
			//papel x papel	
			}else if(Jpapel.isSelected() && pc == 1) {
				result.setText("EMPATE");
				status.setText("PAPEL");
			
			//tesoura x tesoura	
			}else if(Jtesoura.isSelected() && pc == 2) {	
				result.setText("EMPATE");
				status.setText("TESOURA");
				
			//papel x tesoura	
			}else if(Jpapel.isSelected() && pc == 2) {
				result.setText("VOCÊ PERDEU");
				status.setText("TESOURA");
			
			//pedra x papel	
			}else if(Jpedra.isSelected() && pc == 1) {
				result.setText("VOCÊ PERDEU");
				status.setText("PAPEL");
			
				//tesoura x pedra	
			}else{
				result.setText("VOCÊ PERDEU");
				status.setText("PEDRA");
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
		JokeyPow jogo = new JokeyPow();

	}
}
