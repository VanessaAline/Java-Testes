import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class Camisa extends JFrame{
	
	
	private JFrame tela = new JFrame();
	
	private JLabel lbmat = new JLabel("MATRÍCULA");
	private JLabel lbtamanho = new JLabel("TAMANHO DA CAMISA");
	private JLabel lbcor = new JLabel("SELECIONE A COR DA CAMISA:");
	private JLabel lbcorSelecionada = new JLabel();
	private JLabel lbqtd = new JLabel("QUANTIDADE DE CAMISAS");
	private JLabel labelBranco = new JLabel(new ImageIcon(getClass().getResource("imagens/Branco.png")));
	private JLabel labelAmarelo = new JLabel(new ImageIcon(getClass().getResource("imagens/Amarelo.png")));
	private JLabel labelVerde = new JLabel(new ImageIcon(getClass().getResource("imagens/Verde.png")));
	private JLabel labelVermelho = new JLabel(new ImageIcon(getClass().getResource("imagens/Vermelho.png")));
	private JLabel labelAzul = new JLabel(new ImageIcon(getClass().getResource("imagens/Azul.png")));
	private JLabel label = new JLabel("");
	
	private JTextField txtmatricula = new JTextField();
	private JTextField txtquantidade = new JTextField();
	
	private JComboBox<String> combo = new JComboBox<String>();
	private JButton btsolicitar = new JButton("ENVIAR");
	
	private String corCamisa;
	private String matricula;
	private int quantidade;
	private String tamanho;
	
	//Construtor
	public Camisa() {
		
		//Configuraca da tela
		tela.setLayout(null);
		tela.setVisible(true);
		tela.setSize(310, 480);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		//Adcionando Componentes a Tela
		tela.getContentPane().add(lbmat);
		lbmat.setVisible(true);
		lbmat.setBounds(45,80,150,50);
		lbmat.setFont(new Font("Tahoma", 1, 12));
		
		tela.getContentPane().add(lbtamanho);
		lbtamanho.setBounds(45,150,250,30);
	    lbtamanho.setFont(new Font("Tahoma", 1, 12));
	    
		tela.getContentPane().add(lbcor);
		lbcor.setBounds(45,240,250,30);
		lbcor.setFont(new Font("Tahoma", 1, 12));
		
		tela.getContentPane().add(lbqtd);
		lbqtd.setBounds(45,185,200,50);
		lbqtd.setFont(new Font("Tahoma", 1, 12));
		
		tela.getContentPane().add(txtmatricula);
		txtmatricula.setBounds(170,100,80,20);
		
		tela.getContentPane().add(txtquantidade);
		txtquantidade.setBounds(210,200,40,20);
		
		tela.getContentPane().add(combo);
		btsolicitar.setBounds(50,370,200,30);
		
		tela.getContentPane().add(btsolicitar);
		btsolicitar.setFont(new Font("Tahoma", 1, 18));
		
		combo.setBounds(200,140,50,30);
		combo.addItem(null);
		combo.addItem("P");
		combo.addItem("M");
		combo.addItem("G");	
		
		//Adcionando e Setando Posicoes das Labels
		tela.getContentPane().add(labelBranco);
		labelBranco.setBounds(45,270,60,27);
		
		tela.getContentPane().add(labelAzul);
		labelAzul.setBounds(115,270,60,27);
		
		tela.getContentPane().add(labelVerde);
		labelVerde.setBounds(185,270,60,27);
		
		tela.getContentPane().add(labelAmarelo);
		labelAmarelo.setBounds(155,315,60,27);
		
		tela.getContentPane().add(labelVermelho);
		labelVermelho.setBounds(85,315,60,27);
		
		this.evento(labelAzul);
		this.evento(labelBranco);
		this.evento(labelAmarelo);
		this.evento(labelVermelho);
		this.evento(labelVerde);
	}
		//manipulacao das labels das cores
		public void evento(JLabel label) {
			label.addMouseListener(new MouseAdapter(){

			@Override
            public void mouseEntered(MouseEvent e) {
				
				JLabel label = (JLabel) e.getSource();
	               if(label != lbcorSelecionada){
	            	   label.setBorder(new MatteBorder(1, 1, 3, 3, Color.black));
	               }
			}
			@Override
            public void mouseExited(MouseEvent e) {
				label.setBorder(null);
			}

			@Override
			public void mouseClicked(MouseEvent e){
				if(label.equals(labelBranco)){
					corCamisa = "0000";
					lbcorSelecionada = labelBranco;
					
				}else if(label.equals(labelAzul)){
					corCamisa = "1100";
					lbcorSelecionada = labelAzul;
					
				}else if(label.equals(labelVermelho)){
					corCamisa = "0110";
					lbcorSelecionada = labelVermelho;
					
				}else if(label.equals(labelVerde)){
					corCamisa = "1010";
					lbcorSelecionada = labelVerde;
					
				}else if(label.equals(labelAmarelo)){
					corCamisa = "0010";
					lbcorSelecionada = labelAmarelo;
				}
			}
		});
    	
		btsolicitar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent solicitar) {
				try {
					matricula = txtmatricula.getText();
					quantidade = Integer.parseInt(txtquantidade.getText());
					
					if(corCamisa == null || combo.getSelectedItem() == null) {
						JOptionPane.showMessageDialog(null, "Prencha todos os campos!");
						
					}else if(quantidade == 0){ //quantidade não pode ser zero
						JOptionPane.showMessageDialog(null, "Quantidade não pode ser zero!");
						
					}else if(matricula.equals("0")){ //matricula nao pode ser zero
						JOptionPane.showMessageDialog(null, "Erro na Matrícula!");
						
					}else {
						if(combo.getSelectedItem() != null) {
							tamanho = (String) combo.getSelectedItem();
						}
					}
				}catch(NumberFormatException ex) {
					if(matricula.equals("0")){
						JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					}
					if(quantidade == 0) {
						JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					}
					 
				}
				
				if(quantidade != 0 && !matricula.equals("00000000") &&  combo.getSelectedItem() != null && corCamisa != null) {
					JOptionPane.showMessageDialog(null, "Solicitação feita com sucesso!");
				}
				
				//for para escrever uma linha para cada pedido
				for(int i=0; i<quantidade; i++) {
					String texto = matricula+":"+tamanho+":"+corCamisa;

					try {
						salvar(texto); 
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				System.exit(0);
			}
		});
		
	}
	
	//Salvar no .txt	
		public void salvar(String texto) throws IOException {
			
			String usuario = System.getProperty("user.home");
			FileWriter arquivo = new FileWriter(usuario+"\\Desktop\\Camisas.txt", true);
			PrintWriter gravarArquivo = new PrintWriter(arquivo); 

			gravarArquivo.println(texto); //gravando o texto
			
			arquivo.close(); //fechando o arquivo
			gravarArquivo.close();	
		}
		
	public static void main(String[] args) {
		
		Camisa escolha = new Camisa();

	}

}
