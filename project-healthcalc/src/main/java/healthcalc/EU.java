package healthcalc;

public class EU extends DecoratorRegion{

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
        HealthHospital espanyol = new Espanyol(super.hospital);
        HealthHospital ingles = new Ingles(super.hospital);
        float resultado_español= espanyol.bmr(genero, edad, altura, peso);
        ingles.bmr(genero, edad, altura, peso);
        //Si devuelvo el resultado_español solo se llamara una vez y no me saldra dos veces
        return resultado_español;
    }


}
