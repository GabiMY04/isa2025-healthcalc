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
        //Se pasa el peso en gramos y la altura en metros y hay que pasarlas
        float resultado= super.bmr(genero, edad, altura, peso);
        float peso_kg = (float) (peso / 1000.0);
        float libras = peso_kg * 2.20462f; 
        float pies = (float) (altura * 3.28084); //Me parece mas conveniente ya que es en ingles todo
        System.out.printf("The person with a height of %.2f feats and a weight of %.2f lbs has a BMR of %.2f.%n", pies, libras, resultado);
        return resultado;
    }


    

}
