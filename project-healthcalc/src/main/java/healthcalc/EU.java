package healthcalc;

public class EU extends DecoratorRegion{
    //una versión europea (que acepte la altura en metros y el peso en gramos)
    public EU(HealthHospital hospital) {
        super(hospital);
    }
    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        return super.pesoIdeal(gender, altura);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        //Es necesario cambiar la variable hospital a protected para poder acceder a ella
        //Se supone que aqui lo que se pasa en altura y peso son metros y gramos
        float alturaPies = (float) (altura * 3.28084);
        int pesoLibras = (int) (peso / 453.59237);
        HealthHospital espanyol = new Espanyol(super.hospital);
        HealthHospital ingles = new Ingles(super.hospital);
        // Esta deberia de mostrarse con los medidas americanas
        ingles.bmr(genero, edad, alturaPies, pesoLibras);
        //Esta no la modificamos ya que se supone que es en metros y gramos
        return espanyol.bmr(genero, edad, altura, peso);
    }


}
