package healthcalc;

public class Singleton implements HealthCalc{
    private static Singleton instance;
    private final HealthCalc calc;
    //CREAMOS UN CONSTRUCTOR PRIVADO PARA QUE NO SE PUEDA CREAR MAS DE UNA CLASE DE IMPLEMENTACION
    private Singleton() {
        calc = new HealthCalcImpl();
    }

    //CREAMO EL GETINSTANCE QUE PROCURA QUE NO PASE 
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    //COMO SE IMPLEMENTA HEALTHCALC PONEMOS SUS METODOS
    @Override
    public float idealWeight(int height, char gender) throws Exception {
        return calc.idealWeight(height, gender);
    }

    @Override
    public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception {
        return calc.basalMetabolicRate(weight, height, age, gender);
    }
}
