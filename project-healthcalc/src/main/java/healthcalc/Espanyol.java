package healthcalc;

public class Espanyol extends DecoratorIdiom {

    public Espanyol(HealthHospital hospital) {
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
        float peso_spain = (float) (peso / 1000.0); //Convertir a kg
        float altura_spain = (float) (altura); //Altura en metros
        System.out.printf("La persona con una altura de %.2f metros y un peso de %.2f kg tiene un BMR de %.2f.%n", altura_spain, peso_spain, resultado);
        return resultado;
    }


    

}
