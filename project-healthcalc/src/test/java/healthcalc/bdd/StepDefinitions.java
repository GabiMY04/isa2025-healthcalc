package healthcalc.bdd;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static healthcalc.HealthCalc.*;

import org.junit.jupiter.api.Assertions;

import healthcalc.HealthCalc;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//public class StepDefinitions, para rellenarla hacemos un .feature y ejecuatmos el mvn test
public class StepDefinitions {

    private char genero;
    private int altura;
    private int edad;
    private float peso;
    private String resultado;
    private boolean raiseException ;

    @Before
	public void initialization() {
		genero = '\0';
        altura = 0;
        edad = 0;  
        peso = 0;
        resultado = null;
        raiseException = false; 
	}

	@Given("La altura introducida es mayor a {int} metros")
    public void la_altura_introducida_es_mayor_a_metros(Integer altura) {
        this.genero = 'H';
        this.altura = altura + 1; 
    }

    @Given("Introduzco los datos correctos")
    public void introduzco_los_datos_correctos() {
        this.genero = 'H';
        this.altura = 175;
    }

    @Given("el genero introducido es distinto de M")
    public void el_genero_introducido_es_distinto_de_m() {
        this.genero = 'G';
    }

    @Given("el genero es distinto de H")
    public void el_genero_es_distinto_de_h() {
        this.genero = 'G';
    }

    @Given("el genero no tiene valor")
    public void el_genero_no_tiene_valor() {
        this.genero = '\0';
    }

    @Given("edad mayor a {int} años")
    public void edad_mayor_a_años(Integer edad) {
        this.edad = edad + 1;
    }

    @Given("el peso introducir es menor a 300kg")
    public void el_peso_introducir_es_menor_a_300kg() {
        this.peso = 200;
    }

    @Given("el peso es mayor a {int} kg")
    public void el_peso_es_mayor_a_kg(Integer peso) {
        this.peso = peso + 100;
    }

    @When("presiono el boton calcular")
    public void presiono_el_boton_calcular() {
        //NO SE
        if (edad > 0) {
            this.resultado = basalMetabolicRate(peso, altura, edad, genero);
        } else {
            this.resultado = idealWeight(genero, altura);
        }
    }    
    public void se_muestra_por_pantalla_un_error_de_altura_incorrecta() {
        Assertions.assertTrue(raiseException);
    }

    @Then("Se muestra el resultado de la funcion peso ideal por pantalla")
    public void se_muestra_el_resultado_de_la_funcion_peso_ideal_por_pantalla() {
        assertTrue(resultado.contains("Peso ideal"), "El resultado no contiene 'Peso ideal'");
        //NO SE
    }

    @Then("El error se muestra por pantalla que el genero es invalido")
    public void el_error_se_muestra_por_pantalla_que_el_genero_es_invalido() {
        assertEquals("Error: genero invalido", resultado);
    }

    @Then("se muestra un error por la pantalla indicando que el genero es obligatorio")
    public void se_muestra_un_error_por_la_pantalla_indicando_que_el_genero_es_obligatorio() {
        assertEquals("Error: genero obligatorio", resultado);
    }

    @Then("Se muestra por pantalla un error en la edad introducida")
    public void se_muestra_por_pantalla_un_error_en_la_edad_introducida() {
        assertEquals("Error: Edad invalida", resultado);
    }


    @Then("Se muestra el resultado de la funcion calcular tasa metabolica por pantalla")
    public void se_muestra_el_resultado_de_la_funcion_calcular_tasa_metabolica_por_pantalla() {
        assertTrue(resultado.contains("Tasa metabolica"), "El resultado no contiene 'Tasa metabolica'");
        // NO SE
    }

}
