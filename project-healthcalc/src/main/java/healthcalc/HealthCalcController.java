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
            Gender gender = genero.toLowerCase().charAt(0) == 'm' ? Gender.MALE : Gender.FEMALE;
            Person p = new PersonImpl(0, altura, 0, gender);

            double resultado = modelo.idealWeight(p);
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
            Gender gender = genero.toLowerCase().charAt(0) == 'm' ? Gender.MALE : Gender.FEMALE;

            String pesoStr = vista.getPeso_meta();
            float peso = Float.parseFloat(pesoStr);

            int edad = vista.getEdad_meta();
            Person p = new PersonImpl(peso, altura, edad, gender);

            float resultado = modelo.basalMetabolicRate(p);
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
