package healthcalc;

public class HealthAdapter implements HealthHospital{
    private HealthCalc calc;
    public HealthAdapter() {
        calc = HealthCalcImpl.getInstance();
    }
    public HealthAdapter(HealthCalc calc) {
        this.calc = calc;
    }

    @Override
    public float pesoIdeal(Person person) throws Exception {
        //Altura en metros
        float altura1 = person.height() * 100f;
        
        Person p = new PersonImpl(person.Weight(), altura1,person.age(), person.gender());
        return calc.idealWeight(p);

    }

    @Override
    public float bmr(Person person) throws Exception {
        //Peso en gramos
        float peso1 = person.Weight() / 1000f;
        float altura1 = person.height() * 100f;
        Person p = new PersonImpl(peso1, altura1, person.age(),person.gender());
        return calc.basalMetabolicRate(p);
        
    }

}
