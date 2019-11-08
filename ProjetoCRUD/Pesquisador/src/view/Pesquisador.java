package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window.Type;

import javax.swing.JFrame;

import util.Global;
import util.Icone;
//import util.Sessao;

public class Pesquisador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pesquisador window = new Pesquisador();
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
	public Pesquisador() {		
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setTitle("Acessar sistema");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(""));			
		frame.setLocationRelativeTo(null);
		Global.icone = new Icone();
	}

}
