package healthcalc;

public class DecoratorRegion implements HealthHospital {
    protected  HealthHospital hospital;
    public DecoratorRegion(HealthHospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public float pesoIdeal(Person person) throws Exception {
        return hospital.pesoIdeal(person);
    }

    @Override
    public float bmr(Person person) throws Exception {
        return hospital.bmr(person);
    }

}
