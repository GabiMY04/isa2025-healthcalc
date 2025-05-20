package healthcalc;

public class Ingles extends DecoratorIdiom {

    public Ingles(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        float resultado = super.pesoIdeal(gender, altura);
        return resultado;
    }
    //Como solo se especifica el mensaje para bmr pues en la clase pesoIdeal se queda igual
    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        //SOLO EL MENSAJE , SIN MODIFICA LAS METRICAS DE ESO SE ENCARGA EU Y USA
        float resultado= super.bmr(genero, edad, altura, peso);
        System.out.printf("The person with a height of %.2f feats and a weight of %.2f lbs has a BMR of %.2f.%n", altura, peso, resultado);
        return resultado;
    }


    

}
