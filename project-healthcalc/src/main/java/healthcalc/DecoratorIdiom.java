package healthcalc;

public class DecoratorIdiom implements HealthHospital{
    protected  HealthHospital hospital;
    public DecoratorIdiom(HealthHospital hospital) {
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
