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
        if (altura < 3) {
            //(EU)
            System.out.printf("The person with a height of %.2f meters and a weight of %.2f kilograms has a BMR of %.2f.%n", altura, (float)peso/1000, resultado);
        } else {
            //(USA), Que no hay gente de 3 metros
            System.out.printf("The person with a height of %.2f feet and a weight of %.2f lbs has a BMR of %.2f.%n", altura, (float)peso, resultado);
        }
        return resultado;
    }


    

}
