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
        float resultado= super.bmr(genero, edad, altura, peso);
        float libras =  (float) (peso * 2.20462);
        float pies = (float) (altura * 3.28084); //Me parece mas conveniente ya que es en ingles todo
        System.out.printf("The person with a height of %.2f meters and a weight of %.2f lbs has a BMR of %.2f.%n", pies, libras, resultado);
        return resultado;
    }


    

}
