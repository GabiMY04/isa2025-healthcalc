package healthcalc;

public class CardiovascularMetrics {
    Person person;
    HealthCalc healthCalc;

    public CardiovascularMetrics(Person person) {
        this.person = person;
        this.healthCalc = HealthCalcImpl.getInstance();
    }
    public double getIdealBodyWeight() throws Exception {
        char gender = (person.gender() == Gender.MALE) ? 'm' : 'w';
        int age = person.age();
        double res=healthCalc.idealWeight(person);
        
        return res;
    }
}
