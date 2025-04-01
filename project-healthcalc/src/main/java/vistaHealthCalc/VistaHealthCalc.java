package vistaHealthCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.TextField;

public class VistaHealthCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaHealthCalc frame = new VistaHealthCalc();
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
	public VistaHealthCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(13, 10));
		
		JPanel panel_central_principal = new JPanel();
		contentPane.add(panel_central_principal, BorderLayout.CENTER);
		panel_central_principal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_secundario_w = new JPanel();
		panel_central_principal.add(panel_secundario_w, BorderLayout.WEST);
		panel_secundario_w.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_terciario_norte = new JPanel();
		panel_secundario_w.add(panel_terciario_norte, BorderLayout.NORTH);
		panel_terciario_norte.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Calcular_peso_ideal");
		panel_terciario_norte.add(lblNewLabel_3);
		
		JPanel panel_terciario_sur = new JPanel();
		panel_secundario_w.add(panel_terciario_sur, BorderLayout.SOUTH);
		panel_terciario_sur.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_secundario_e = new JPanel();
		panel_central_principal.add(panel_secundario_e, BorderLayout.EAST);
		panel_secundario_e.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_terciario_e_norte = new JPanel();
		panel_secundario_e.add(panel_terciario_e_norte, BorderLayout.NORTH);
		panel_terciario_e_norte.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Calcular_tasa_metabolica");
		panel_terciario_e_norte.add(lblNewLabel_2);
		
		JPanel panel_terciario_e_sur = new JPanel();
		panel_secundario_e.add(panel_terciario_e_sur, BorderLayout.SOUTH);
		this.pack();
	}

}
