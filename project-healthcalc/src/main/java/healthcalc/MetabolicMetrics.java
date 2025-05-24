package healthcalc;

public class MetabolicMetrics {
    Person person;
    HealthCalc healthCalc;

    public MetabolicMetrics(Person person) {
        this.person = person;
        this.healthCalc = HealthCalcImpl.getInstance();
    }
    public double basalMetabolicRate() throws Exception {
        char gender = (person.gender() == Gender.MALE) ? 'm' : 'w';
        int age = person.age();
        float weight = person.Weight();
        int height = (int) person.height();
        double res = healthCalc.basalMetabolicRate(weight, height, age, gender);
        return res;
    }
}
