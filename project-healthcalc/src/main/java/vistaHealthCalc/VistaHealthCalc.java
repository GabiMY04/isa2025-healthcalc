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
		
		JPanel panel_E = new JPanel();
		panel_E.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_E, BorderLayout.EAST);
		panel_E.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_n = new JPanel();
		panel_E.add(panel_n, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("CALCULAR_METABOLICO");
		panel_n.add(lblNewLabel_1);
		
		JPanel panel_S = new JPanel();
		panel_E.add(panel_S, BorderLayout.SOUTH);
		
		JPanel panel_W = new JPanel();
		panel_W.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_W, BorderLayout.WEST);
		panel_W.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel_N = new JPanel();
		panel_W.add(Panel_N, BorderLayout.NORTH);
		
		JLabel lblCalcularpesoideal = new JLabel("CALCULAR_PESO_IDEAL");
		Panel_N.add(lblCalcularpesoideal);
		
		JPanel panel_SS = new JPanel();
		panel_W.add(panel_SS, BorderLayout.SOUTH);
		panel_SS.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_res = new JPanel();
		panel_SS.add(panel_res, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("RESULTADO");
		panel_res.add(lblNewLabel);
		
		TextField textField = new TextField();
		panel_res.add(textField);
		
		JPanel panel_button1 = new JPanel();
		panel_SS.add(panel_button1, BorderLayout.EAST);
		panel_button1.setLayout(new BorderLayout(0, 0));
		
		Button button = new Button("Calcular");
		panel_button1.add(button, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		this.pack();
	}

}
