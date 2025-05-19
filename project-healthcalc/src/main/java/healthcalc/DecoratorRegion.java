package healthcalc;

public class DecoratorRegion implements HealthHospital {
    protected  HealthHospital hospital;
    public DecoratorRegion(HealthHospital hospital) {
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
