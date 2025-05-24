package healthcalc;

public class MetabolicMetrics {
    Person person;
    HealthCalc healthCalc;

    public MetabolicMetrics(Person person) {
        this.person = person;
        this.healthCalc = HealthCalcImpl.getInstance();
    }
    public double basalMetabolicRate() throws Exception {
        double res = healthCalc.basalMetabolicRate(person);
        return res;
    }
}
