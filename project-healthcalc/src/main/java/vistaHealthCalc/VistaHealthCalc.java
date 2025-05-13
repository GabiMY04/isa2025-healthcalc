package vistaHealthCalc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VistaHealthCalc extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private JTextField altura_peso_ideal;
    private JTextField peso_meta;
    private JTextField altura_meta;
    private JTextField res_meta;
    private JTextField res_peso_ideal;
    private JComboBox<String> genero_meta;
    private JComboBox<String> genero_peso_ideal;
    private JComboBox<String> edad_meta;
    private Button b_res_peso_ideal;
    private Button b_res_meta;


    public VistaHealthCalc() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(700, 300);
        setBounds(100, 100, 800, 600);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(10, 10));
        setContentPane(contentPane);

        JPanel panel_central_principal = new JPanel(new BorderLayout());
        contentPane.add(panel_central_principal, BorderLayout.CENTER);

        JPanel panel_secundario_w = new JPanel(new BorderLayout());
        panel_secundario_w.setPreferredSize(new Dimension(300, 600));
        panel_secundario_w.setBackground(Color.GRAY);
        panel_central_principal.add(panel_secundario_w, BorderLayout.WEST);

        JLabel lblPesoIdeal = new JLabel("Calcular_peso_ideal", SwingConstants.CENTER);
        panel_secundario_w.add(lblPesoIdeal, BorderLayout.NORTH);

        JPanel panel_central_peso = new JPanel(new GridLayout(2, 2));
        panel_central_peso.setBackground(Color.LIGHT_GRAY);
        panel_secundario_w.add(panel_central_peso, BorderLayout.CENTER);
        
        JLabel lblNewLabel_4 = new JLabel("Altura");
        panel_central_peso.add(lblNewLabel_4);
        altura_peso_ideal = new JTextField();
        panel_central_peso.add(altura_peso_ideal);
        
        JLabel lblNewLabel_5 = new JLabel("Genero");
        panel_central_peso.add(lblNewLabel_5);
        genero_peso_ideal = new JComboBox<>(new String[]{"Women", "Men"});
        panel_central_peso.add(genero_peso_ideal);

        JPanel panel_sur_peso = new JPanel(new BorderLayout());
        panel_secundario_w.add(panel_sur_peso, BorderLayout.SOUTH);

        JPanel resultadoPesoPanel = new JPanel();
        
        JLabel lblNewLabel_7 = new JLabel("Resultado peso ideal");
        resultadoPesoPanel.add(lblNewLabel_7);
        res_peso_ideal = new JTextField(10);
        res_peso_ideal.setEditable(false);
        resultadoPesoPanel.add(res_peso_ideal);
        panel_sur_peso.add(resultadoPesoPanel, BorderLayout.CENTER);

        b_res_peso_ideal = new Button("Calcular");
        panel_sur_peso.add(b_res_peso_ideal, BorderLayout.EAST);

        JPanel panel_secundario_e = new JPanel(new BorderLayout());
        panel_secundario_e.setPreferredSize(new Dimension(300, 600));
        panel_secundario_e.setBackground(Color.GRAY);
        panel_central_principal.add(panel_secundario_e, BorderLayout.EAST);

        JLabel lblTMB = new JLabel("Calcular_tasa_metabolica", SwingConstants.CENTER);
        panel_secundario_e.add(lblTMB, BorderLayout.NORTH);

        JPanel panel_central_tmb = new JPanel(new GridLayout(4, 2));
        panel_central_tmb.setBackground(Color.LIGHT_GRAY);
        panel_secundario_e.add(panel_central_tmb, BorderLayout.CENTER);
        
        JLabel lblNewLabel = new JLabel("Altura");
        panel_central_tmb.add(lblNewLabel);
        altura_meta = new JTextField();
        panel_central_tmb.add(altura_meta);
        
        JLabel lblNewLabel_1 = new JLabel("Peso");
        panel_central_tmb.add(lblNewLabel_1);
        peso_meta = new JTextField();
        panel_central_tmb.add(peso_meta);
        edad_meta = new JComboBox<>();
        for (int i = 1; i <= 120; i++) {
            edad_meta.addItem(String.valueOf(i));
        }
        
        JLabel lblNewLabel_2 = new JLabel("Edad");
        panel_central_tmb.add(lblNewLabel_2);
        panel_central_tmb.add(edad_meta);
        
        JLabel lblNewLabel_3 = new JLabel("Genero");
        panel_central_tmb.add(lblNewLabel_3);
        genero_meta = new JComboBox<>(new String[]{"Women", "Men"});
        panel_central_tmb.add(genero_meta);

        JPanel panel_sur_tmb = new JPanel(new BorderLayout());
        panel_sur_tmb.setBackground(Color.LIGHT_GRAY);
        panel_secundario_e.add(panel_sur_tmb, BorderLayout.SOUTH);

        JPanel resultadoTMBPanel = new JPanel();
        
        JLabel lblNewLabel_6 = new JLabel("Resultado TMB");
        resultadoTMBPanel.add(lblNewLabel_6);
        res_meta = new JTextField(10);
        res_meta.setEditable(false);
        resultadoTMBPanel.add(res_meta);
        panel_sur_tmb.add(resultadoTMBPanel, BorderLayout.CENTER);

        b_res_meta = new Button("Calcular");
        panel_sur_tmb.add(b_res_meta, BorderLayout.EAST);
        //this.pack();
        this.setSize(700, 200);          // Tamaño fijo
        this.setLocationRelativeTo(null); // Centra la ventana
        this.setResizable(false);         // No redimensionable
        this.setVisible(true);            // Mostrar ventana
    }

    public Button getBotonPesoIdeal() { 
    	return b_res_peso_ideal;
    	}
    public Button getBotonTMB() { 
    	return b_res_meta; }

    public String getAltura_peso_ideal() { return altura_peso_ideal.getText(); }
    public String getPeso_meta() { return peso_meta.getText(); }
    public String getAltura_meta() { return altura_meta.getText(); }
    public String getGeneroPesoIdeal() { return (String) genero_peso_ideal.getSelectedItem(); }
    public String getGeneroMeta() { return (String) genero_meta.getSelectedItem(); }
    public int getEdad_meta() { return Integer.parseInt((String) edad_meta.getSelectedItem()); }

    public void setRes_peso_ideal(String resultado) { res_peso_ideal.setText(resultado); }
    public void setRes_meta(String resultado) { res_meta.setText(resultado); }

    //public HealthCalcImpl getCalculadora() { return calculadora; }
    //public void setCalculadora(HealthCalcImpl calculadora) { this.calculadora = calculadora; }

    public static long getSerialversionuid() { return serialVersionUID; }
    
}
