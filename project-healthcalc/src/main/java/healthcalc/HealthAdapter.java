package healthcalc;

public class HealthAdapter implements HealthHospital{
    private HealthCalc calc;
    public HealthAdapter() {
        calc = HealthCalcImpl.getInstance();
    }

    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        //Altura en metros
        float altura1 = altura * 100f;
        return calc.idealWeight((int) altura1, gender);

    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        //Peso en gramos
        float peso1 = peso / 1000f;
        float altura1 = altura * 100f;
        return calc.basalMetabolicRate(peso1, (int) altura1, edad, genero);
        
    }

}
