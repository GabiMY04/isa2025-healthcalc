package healthcalc;

public class Espanyol extends DecoratorIdiom {

    public Espanyol(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(Person person) throws Exception {
        float resultado = super.pesoIdeal(person);
        return resultado;
    }
    //Como solo se especifica el mensaje para bmr pues en la clase pesoIdeal se queda igual
    @Override
    public float bmr(Person person) throws Exception {
        float resultado= super.bmr(person);
        if (person.height() < 3) {
            // EU
            float pesoKg = (float)person.Weight() / 1000f;
            System.out.printf("La persona con una altura de %.2f metros y un peso de %.2f kg tiene un BMR de %.2f.%n", person.height(), pesoKg, resultado);
        } else {
            // USA
            System.out.printf("La persona con una altura de %.2f pies y un peso de %.2f libras tiene un BMR de %.2f.%n", person.height(), (float)person.Weight(), resultado);
        }

        return resultado;
    }


    

}
