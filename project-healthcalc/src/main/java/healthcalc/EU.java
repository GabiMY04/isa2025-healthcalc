package healthcalc;

public class EU extends DecoratorRegion{
    //una versión europea (que acepte la altura en metros y el peso en gramos)
    public EU(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(Person person) throws Exception {
        return super.pesoIdeal(person);
    }

    @Override
    public float bmr(Person person) throws Exception {
        return super.bmr(person);
    }


}
