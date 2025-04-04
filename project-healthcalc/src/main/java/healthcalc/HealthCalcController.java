package healthcalc;

import vistaHealthCalc.VistaHealthCalc;

public class HealthCalcController {

    private VistaHealthCalc vista;
    private HealthCalcImpl modelo;

    public HealthCalcController(VistaHealthCalc vista, HealthCalcImpl modelo) {
        this.vista = vista;
        this.modelo = modelo;
        initControladores();
    }

    private void initControladores() {
        vista.getBotonPesoIdeal().addActionListener(e -> calcularPesoIdeal());
        vista.getBotonTMB().addActionListener(e -> calcularTasaMetabolica());
    }

    private void calcularPesoIdeal() {
        try {
            String alturaStr = vista.getAltura_peso_ideal();
            int altura = Integer.parseInt(alturaStr);

            String genero = vista.getGeneroPesoIdeal();
            char generoChar = genero.toLowerCase().charAt(0);

            double resultado = modelo.idealWeight(altura, generoChar);
            vista.setRes_peso_ideal(String.format("%.2f kg", resultado));
        } catch (NumberFormatException ex) {
            vista.setRes_peso_ideal("Altura invalida");
        } catch (IllegalArgumentException ex) {
            vista.setRes_peso_ideal(ex.getMessage());
        } catch (Exception ex) {
            vista.setRes_peso_ideal("Error distinto a la altura o el genero");
            ex.printStackTrace();
        }
    }

    private void calcularTasaMetabolica() {
        try {
            String alturaStr = vista.getAltura_meta();
            int altura = Integer.parseInt(alturaStr);

            String genero = vista.getGeneroMeta();
            char generoChar = genero.toLowerCase().charAt(0);

            String pesoStr = vista.getPeso_meta();
            float peso = Float.parseFloat(pesoStr);

            int edad = vista.getEdad_meta();

            float resultado = modelo.basalMetabolicRate(peso, altura, edad, generoChar);
            vista.setRes_meta(String.format("%.2f j/seg", resultado));
        } catch (NumberFormatException ex) {
            vista.setRes_meta("Alguno de los datos introducidos no es correcto");
        } catch (IllegalArgumentException ex) {
            vista.setRes_meta(ex.getMessage());
        } catch (Exception ex) {
            vista.setRes_meta("Error distinto a la altura, genero,edad o peso");
            ex.printStackTrace();
        }
    }
}
