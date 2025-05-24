package healthcalc;

public class CardiovascularMetrics {
    Person person;
    HealthCalc healthCalc;

    public CardiovascularMetrics(Person person) {
        this.person = person;
        this.healthCalc = HealthCalcImpl.getInstance();
    }
    public double getIdealBodyWeight() throws Exception {
        double res=healthCalc.idealWeight(person);
        
        return res;
    }
}
