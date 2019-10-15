
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

public class ConnectionExcel extends JFrame{
	
	
	private JFrame tela = new JFrame();
	
	private JLabel lbcod = new JLabel("CÓDIGO DO PRODUTO: ");
	private JLabel lbqtd = new JLabel("QUANTIDADE: ");
	private JLabel lbnome = new JLabel("NOME DO PRODUTO: ");
	//private JLabel labelBranco = new JLabel(new ImageIcon(getClass().getResource("imagens/Branco.png")));
	private JLabel lbcabecalho = new JLabel("CONTROLE DE ESTOQUE");
	
	private JLabel lbcompra = new JLabel("PREÇO DE COMPRA: ");
	private JLabel lbvenda = new JLabel("PREÇO DE VENDA: ");
	private JLabel lblucro = new JLabel("LUCRO(%): ");
	private JLabel lbmarca = new JLabel("MARCA: ");
	private JLabel lbcategoria = new JLabel("CATEGORIA: ");
	
	private JTextField txtcod = new JTextField();
	private JTextField txtquantidade = new JTextField();
	private JTextField txtnome = new JTextField();
	private JTextField txtcompra = new JTextField();
	private JTextField txtvenda = new JTextField();
	private JTextField txtlucro = new JTextField();
	private JTextField txtmarca = new JTextField();
	private JTextField txtcategoria = new JTextField();
	
	private JButton btcadastrar = new JButton("CADASTRAR NOVO PRODUTO");
	private JButton btpesquisar = new JButton("PESQUISAR");
	private JButton btexcluir = new JButton("EXCLUIR");
	private JButton btsalvar = new JButton("SALVAR NO EXCEL");

	private String cod, marca, categoria, nomeproduto;
	private int quantidade;
	private float precovenda, precocompra, lucro;
	
	//Construtor
	public ConnectionExcel() {
		
		//Configuraca da tela
		tela.setLayout(null);
		tela.setVisible(true);
		tela.setSize(700, 300);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		//Adcionando Componentes a Tela

		
		tela.getContentPane().add(lbcabecalho);
		lbcabecalho.setBounds(45,50,150,100);
		lbcabecalho.setFont(new Font("Tahoma", 1, 12));
		
		tela.getContentPane().add(btcadastrar);
		btcadastrar.setFont(new Font("Tahoma", 1, 12));
		btcadastrar.setBounds(50,170,220,60);

		tela.getContentPane().add(btpesquisar);
		btpesquisar.setFont(new Font("Tahoma", 1, 15));
		btpesquisar.setBounds(300,170,145,60);
		
		tela.getContentPane().add(btexcluir);
		btexcluir.setFont(new Font("Tahoma", 1, 15));
		btexcluir.setBounds(480,170,145,60);

    	
		btcadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent solicitar) {
				
				tela.setVisible(false);
				JFrame telacadastro = new JFrame();
				telacadastro.setLayout(null);
				telacadastro.setVisible(true);
				telacadastro.setSize(700, 400);
				telacadastro.setResizable(false);
				telacadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				telacadastro.setLocationRelativeTo(null);
				
				telacadastro.getContentPane().add(lbcod);
				lbcod.setVisible(true);
				lbcod.setBounds(45,83,150,50);
				lbcod.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtcod);
				txtcod.setBounds(200,100,420,20);
				
				telacadastro.getContentPane().add(lbnome);
				lbnome.setBounds(45,135,200,50);
				lbnome.setVisible(true);
				lbnome.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtnome);
				txtnome.setBounds(200,150,250,20);
				
				telacadastro.getContentPane().add(lbqtd);
				lbqtd.setBounds(460,135,200,50);
				lbqtd.setVisible(true);
				lbqtd.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtquantidade);
				txtquantidade.setBounds(560,150,60,20);
				
				telacadastro.getContentPane().add(lbcompra);
				lbcompra.setBounds(45,170,140,90);
				lbcompra.setVisible(true);
				lbcompra.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtcompra);
				txtcompra.setBounds(200,205,60,20);
				
				telacadastro.getContentPane().add(lbvenda);
				lbvenda.setBounds(280,170,210,90);
				lbvenda.setVisible(true);
				lbvenda.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtvenda);
				txtvenda.setBounds(410,205,60,20);
				
				telacadastro.getContentPane().add(lblucro);
				lblucro.setBounds(480,170,210,90);
				lblucro.setVisible(true);
				lblucro.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtlucro);
				txtlucro.setBounds(560,205,60,20);
				
				telacadastro.getContentPane().add(lbmarca);
				lbmarca.setBounds(45,230,100,60);
				lbmarca.setVisible(true);
				lbmarca.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtmarca);
				txtmarca.setBounds(200,250,140,20);
				
				telacadastro.getContentPane().add(lbcategoria);
				lbcategoria.setBounds(360,215,100,90);
				lbcategoria.setVisible(true);
				lbcategoria.setFont(new Font("Tahoma", 1, 12));
				telacadastro.getContentPane().add(txtcategoria);
				txtcategoria.setBounds(460,250,160,20);
				
				telacadastro.getContentPane().add(btsalvar);
				btsalvar.setVisible(true);
				btsalvar.setFont(new Font("Tahoma", 1, 15));
				btsalvar.setBounds(440,300,180,50);
				
			}
		});
		
		btsalvar.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent salvar) {
				
				try {
					cod = txtcod.getText();
					quantidade = Integer.parseInt(txtquantidade.getText());
					
					if(cod == null || nomeproduto == null || precovenda == 0 || precocompra == 0 || marca == null || categoria == null) {
						JOptionPane.showMessageDialog(null, "Prencha todos os campos!");
					} else {
						JOptionPane.showMessageDialog(null, "Dados Salvos no Banco com Sucesso!");
					}
				} catch (Exception ex){
				}
				
				//for para escrever uma linha para cada pedido
				for(int i=0; i<quantidade; i++) {
					String texto = cod + ";"+ nomeproduto+";"+ precovenda + ";" + precocompra + ";" + lucro + ";"
							+ marca + ";" + categoria  + ";";
					try {
						salvar(texto); 
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		
	}
	
	//Salvar no .txt	
		public void salvar(String texto) throws IOException {
			
			
			String usuario = System.getProperty("user.home");
			FileWriter arquivo = new FileWriter(usuario+"\\Desktop\\Camisas.csv", true);
			PrintWriter gravarArquivo = new PrintWriter(arquivo); 

			gravarArquivo.println(texto); //gravando o texto
			
			arquivo.close(); //fechando o arquivo
			gravarArquivo.close();	
		}
		
	public static void main(String[] args) {
		
		ConnectionExcel escolha = new ConnectionExcel();

	}

}