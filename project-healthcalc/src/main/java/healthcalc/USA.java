package healthcalc;
public class USA extends DecoratorRegion{
    public USA(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        return super.pesoIdeal(gender, altura);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        //Es necesario cambiar la variable hospital a protected para poder acceder a ella
        HealthHospital espanyol = new Espanyol(super.hospital);
        HealthHospital ingles = new Ingles(super.hospital);
        espanyol.bmr(genero, edad, altura, peso);
        float resultado_ingles=ingles.bmr(genero, edad, altura, peso);
        return resultado_ingles;

    }
}