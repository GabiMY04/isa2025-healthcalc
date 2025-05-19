package healthcalc;

public class DecoratorIdiom implements HealthHospital{
    protected  HealthHospital hospital;
    public DecoratorIdiom(HealthHospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        return hospital.pesoIdeal(gender, altura);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        return hospital.bmr(genero, edad, altura, peso);
    }

}
