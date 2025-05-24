package healthcalc;
public class USA extends DecoratorRegion{
    //otra americana (que acepte la altura en pies y el peso en libras).
    public USA(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(Person person) throws Exception {
        //float alturaPies = (float) (altura * 3.28084);
        float metros = person.height() * 0.3048f;
        Person p = new PersonImpl(person.Weight(), metros, person.age(), person.gender());
        return super.pesoIdeal(p);
    }

    @Override
    public float bmr(Person person) throws Exception {

        float metros = person.height() * 0.3048f;
        int gramos = (int) (person.Weight() * 453.59237f);
        Person p = new PersonImpl(gramos, metros, person.age(), person.gender());
        return super.bmr(p);

    }
}