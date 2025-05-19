package healthcalc;

public class HealthProxy implements HealthHospital , HealthStats {

    private HealthHospital hospital;
    private float alturaMedia=0;
    private float pesoMedio=0;
    private float edadMedia=0;
    private float bmrMedio=0;
    private int numSexoH=0;
    private int numSexoM=0;
    private int numTotalPacientes=0;

    public HealthProxy() {
        this.hospital = new HealthAdapter();
    }

    @Override
    public float pesoIdeal(char gender, float altura) throws Exception {
        return hospital.pesoIdeal(gender, altura);
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception {
        float bmr = hospital.bmr(genero, edad, altura, peso);
        if (genero == 'h') {
            numSexoH++;
        } else {
            numSexoM++;
        }
        alturaMedia += altura;
        pesoMedio += peso;
        edadMedia += edad;
        bmrMedio += bmr;
        numTotalPacientes++;
        return bmr;
    }

    @Override
    public float alturaMedia() throws Exception {
        if (numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return alturaMedia / numTotalPacientes;
    }

    @Override
    public float pesoMedio() throws Exception {
        if(numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return pesoMedio / numTotalPacientes;
    }

    @Override
    public float edadMedia() throws Exception {
        if (numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return edadMedia / numTotalPacientes;
    }

    @Override
    public float bmrMedio() throws Exception {
        if (numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return bmrMedio / numTotalPacientes;
    }

    @Override
    public int numSexoH() throws Exception {
        if (numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return numSexoH;
    }

    @Override
    public int numSexoM() throws Exception {
        if (numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return numSexoM;
    }

    @Override
    public int numTotalPacientes() throws Exception {
        if (numTotalPacientes == 0) {
            throw new Exception("No hay datos registrados");
        }
        return numTotalPacientes;
    }

}