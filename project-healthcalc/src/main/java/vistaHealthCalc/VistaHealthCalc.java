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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import healthcalc.HealthCalcImpl;

public class VistaHealthCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField altura_peso_ideal;
	private JTextField peso_meta;
	private JTextField altura_meta;
	private JTextField res_meta;
	private JTextField res_peso_ideal;
	//private HealthCalcImpl calculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private HealthCalcImpl calculadora;

			public void run() {
				try {
					this.calculadora=new HealthCalcImpl();
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
		panel_central_principal.setBackground(SystemColor.windowBorder);
		contentPane.add(panel_central_principal, BorderLayout.CENTER);
		panel_central_principal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_secundario_w = new JPanel();
		panel_secundario_w.setBackground(Color.LIGHT_GRAY);
		panel_central_principal.add(panel_secundario_w, BorderLayout.WEST);
		panel_secundario_w.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_terciario_norte = new JPanel();
		panel_secundario_w.add(panel_terciario_norte, BorderLayout.NORTH);
		panel_terciario_norte.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Calcular_peso_ideal");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_terciario_norte.add(lblNewLabel_3);
		
		JPanel panel_terciario_sur = new JPanel();
		panel_secundario_w.add(panel_terciario_sur, BorderLayout.SOUTH);
		panel_terciario_sur.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_resultado = new JPanel();
		panel_terciario_sur.add(panel_resultado, BorderLayout.WEST);
		panel_resultado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_8 = new JLabel("Resultado");
		panel_resultado.add(lblNewLabel_8);
		
		res_peso_ideal = new JTextField();
		res_peso_ideal.setEditable(false);
		res_peso_ideal.setColumns(10);
		panel_resultado.add(res_peso_ideal);
		
		JPanel panel__boton = new JPanel();
		panel_terciario_sur.add(panel__boton, BorderLayout.EAST);
		
		Button b_res_peso_ideal = new Button("Calcular");
		b_res_peso_ideal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui
			}
		});
		panel__boton.add(b_res_peso_ideal);
		
		JPanel panel_terciario_central = new JPanel();
		panel_secundario_w.add(panel_terciario_central, BorderLayout.CENTER);
		panel_terciario_central.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_cuaternario_norte = new JPanel();
		panel_terciario_central.add(panel_cuaternario_norte, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Altura");
		panel_cuaternario_norte.add(lblNewLabel);
		
		altura_peso_ideal = new JTextField();
		panel_cuaternario_norte.add(altura_peso_ideal);
		altura_peso_ideal.setColumns(10);
		
		JPanel panel_cuaternario_sur = new JPanel();
		panel_terciario_central.add(panel_cuaternario_sur, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_cuaternario_sur.add(lblNewLabel_1);
		
		JComboBox genero_peso_ideal = new JComboBox();
		genero_peso_ideal.setModel(new DefaultComboBoxModel(new String[] {"Women", "Men"}));
		panel_cuaternario_sur.add(genero_peso_ideal);
		
		JPanel panel_secundario_e = new JPanel();
		panel_secundario_e.setBackground(Color.LIGHT_GRAY);
		panel_central_principal.add(panel_secundario_e, BorderLayout.EAST);
		panel_secundario_e.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_terciario_e_norte = new JPanel();
		panel_secundario_e.add(panel_terciario_e_norte, BorderLayout.NORTH);
		panel_terciario_e_norte.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Calcular_tasa_metabolica");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_terciario_e_norte.add(lblNewLabel_2);
		
		JPanel panel_terciario_e_sur = new JPanel();
		panel_secundario_e.add(panel_terciario_e_sur, BorderLayout.SOUTH);
		panel_terciario_e_sur.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_terciario_e_sur.add(panel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_9 = new JLabel("Resultado");
		panel_2.add(lblNewLabel_9);
		
		res_meta = new JTextField();
		res_meta.setEditable(false);
		res_meta.setColumns(10);
		panel_2.add(res_meta);
		
		JPanel panel_3 = new JPanel();
		panel_terciario_e_sur.add(panel_3, BorderLayout.EAST);
		
		Button b_res_meta = new Button("Calcular");
		panel_3.add(b_res_meta);
		
		JPanel panel__terciario_central = new JPanel();
		panel_secundario_e.add(panel__terciario_central, BorderLayout.CENTER);
		panel__terciario_central.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_cuarto_central = new JPanel();
		panel__terciario_central.add(panel_cuarto_central, BorderLayout.CENTER);
		panel_cuarto_central.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_quinto_sur = new JPanel();
		panel_cuarto_central.add(panel_quinto_sur, BorderLayout.NORTH);
		
		JLabel lblNewLabel_5 = new JLabel("Altura");
		panel_quinto_sur.add(lblNewLabel_5);
		
		altura_meta = new JTextField();
		panel_quinto_sur.add(altura_meta);
		altura_meta.setColumns(10);
		
		JPanel panel_quinto_norte = new JPanel();
		panel_cuarto_central.add(panel_quinto_norte, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_7 = new JLabel("Genero");
		panel_quinto_norte.add(lblNewLabel_7);
		
		JComboBox genero_meta = new JComboBox();
		genero_meta.setModel(new DefaultComboBoxModel(new String[] {"Women", "Men"}));
		panel_quinto_norte.add(genero_meta);
		
		JPanel panel_quinto_central = new JPanel();
		panel_cuarto_central.add(panel_quinto_central, BorderLayout.CENTER);
		panel_quinto_central.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_sexto_norte = new JPanel();
		panel_quinto_central.add(panel_sexto_norte, BorderLayout.NORTH);
		
		JLabel lblNewLabel_4 = new JLabel("Peso");
		panel_sexto_norte.add(lblNewLabel_4);
		
		peso_meta = new JTextField();
		panel_sexto_norte.add(peso_meta);
		peso_meta.setColumns(10);
		
		JPanel panel_sexto_sur = new JPanel();
		panel_quinto_central.add(panel_sexto_sur, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("Edad");
		panel_sexto_sur.add(lblNewLabel_6);
		
		JComboBox edad_meta = new JComboBox();
		edad_meta.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120"}));
		panel_sexto_sur.add(edad_meta);
		this.pack();
	}

}
