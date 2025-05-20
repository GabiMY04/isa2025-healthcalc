package healthcalc;
public class USA extends DecoratorRegion{
    public USA(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        float alturaPies = (float) (altura * 3.28084);
        return super.pesoIdeal(gender, alturaPies);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        //Es necesario cambiar la variable hospital a protected para poder acceder a ella
        float alturaPies = (float) (altura * 3.28084);
        int pesoLibras = (int) (peso / 453.59237);
        HealthHospital espanyol = new Espanyol(super.hospital);
        HealthHospital ingles = new Ingles(super.hospital);
        espanyol.bmr(genero, edad, altura, peso);
        return ingles.bmr(genero, edad, alturaPies, pesoLibras);

    }
}