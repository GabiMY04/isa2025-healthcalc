package healthcalc;
public class USA extends DecoratorRegion{
    //otra americana (que acepte la altura en pies y el peso en libras).
    public USA(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        //float alturaPies = (float) (altura * 3.28084);
        float metros = altura * 0.3048f;
        return super.pesoIdeal(gender, metros);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {

        float metros = altura * 0.3048f;
        int gramos = (int) (peso * 453.59237f);
        return super.bmr(genero, edad, metros, gramos);

    }
}