package healthcalc;

public interface HealthStats {
    public float  alturaMedia() throws Exception;
    public float  pesoMedio() throws Exception;
    public float  edadMedia() throws Exception;
    public float bmrMedio() throws Exception;
    public int numSexoH() throws Exception;
    public int numSexoM() throws Exception;
    public int numTotalPacientes() throws Exception;
}
