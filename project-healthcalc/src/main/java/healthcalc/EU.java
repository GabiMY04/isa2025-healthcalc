package healthcalc;

public class EU extends DecoratorRegion{
    //una versión europea (que acepte la altura en metros y el peso en gramos)
    public EU(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        return super.pesoIdeal(gender, altura);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        return super.bmr(genero, edad, altura, peso);
    }


}
