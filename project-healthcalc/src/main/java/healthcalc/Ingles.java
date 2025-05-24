package healthcalc;

public class Ingles extends DecoratorIdiom {

    public Ingles(HealthHospital hospital) {
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
        //SOLO EL MENSAJE , SIN MODIFICA LAS METRICAS DE ESO SE ENCARGA EU Y USA
        float resultado= super.bmr(person);
        if (person.height() < 3) {
            //(EU)
            System.out.printf("The person with a height of %.2f meters and a weight of %.2f kilograms has a BMR of %.2f.%n", person.height(), (float)person.Weight()/1000, resultado);
        } else {
            //(USA), Que no hay gente de 3 metros
            System.out.printf("The person with a height of %.2f feet and a weight of %.2f lbs has a BMR of %.2f.%n", person.height(), (float)person.Weight(), resultado);
        }
        return resultado;
    }


    

}
