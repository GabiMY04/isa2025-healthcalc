package healthcalc.bdd;

import org.junit.jupiter.api.Assertions;

import healthcalc.HealthCalcImpl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private HealthCalcImpl calc;
    private float result;
    private boolean raisedException;
    private char genero;
    private int altura;
    private int edad;
    private float peso;

    @Before
    public void setup() {
        calc = new HealthCalcImpl();
        result = 0;
        raisedException = false;
        genero = ' ';
        altura = 0;
        edad = 0;
        peso = 0;
    }

    @Given("Tengo una calculadora de salud")
    public void tengo_una_calculadora_de_salud() {
        calc = new HealthCalcImpl();
    }

    @Given("Introduzco el genero {string}")
    public void introduzco_el_genero(String genero) {
        //Tengo que ponerlo asi o sino me da error
        this.genero = genero.trim().isEmpty() ? '\0' : genero.charAt(0);
    }

    @Given("Introduzco la altura {string}")
    public void introduzco_la_altura(String altura) {
        this.altura=Integer.parseInt(altura);
    }

    @When("Calcular el peso ideal")
    public void calcular_el_peso_ideal() {
        try {
            result = calc.idealWeight(altura, genero);
        } catch (Exception e) {
            raisedException = true;
        }
    }

    @Then("El sistema lanza una excepcion indicando que el genero es incorrecto")
    public void el_sistema_lanza_una_excepcion_indicando_que_el_genero_es_incorrecto() {
        Assertions.assertTrue(raisedException);
    }

    @Then("El sistema lanza una excepcion indicando que la altura es incorrecta")
    public void el_sistema_lanza_una_excepcion_indicando_que_la_altura_es_incorrecta() {
        Assertions.assertTrue(raisedException);
    }

    @Then("Se muestra el resultado {double}")
    public void se_muestra_el_resultado(Double res) {
        Assertions.assertEquals(res, this.result, 0.1);
    }

    @Given("el genero no tiene valor")
    public void el_genero_no_tiene_valor() {
        this.genero=' ';
    }

    @Then("El sistema lanza una excepcion indicando que el genero es obligatorio")
    public void el_sistema_lanza_una_excepcion_indicando_que_el_genero_es_obligatorio() {
        Assertions.assertTrue(raisedException);
    }

    @Given("Edad introducida es {string}")
    public void edad_introducida_es(String edad) {
        this.edad=Integer.parseInt(edad);
    }

    @Given("Introduzco el peso {string}")
    public void introduzco_el_peso(String peso) {
        this.peso=Integer.parseInt(peso);
    }

    @When("Calcular TasaMetabolica")
    public void calcular_tasa_metabolica() {
        try {
            result = calc.basalMetabolicRate(peso, altura, edad, genero);
        } catch (Exception e) {
            raisedException = true;
        }
    }

    @Then("El sistema lanza una excepcion indicando que la edad es incorrecto")
    public void el_sistema_lanza_una_excepcion_indicando_que_la_edad_es_incorrecto() {
        Assertions.assertTrue(raisedException);
    }

    @Then("El sistema lanza una excepcion indicando que el peso es incorrecto")
    public void el_sistema_lanza_una_excepcion_indicando_que_el_peso_es_incorrecto() {
        Assertions.assertTrue(raisedException);
    }

    @Given("la edad no tiene valor")
    public void la_edad_no_tiene_valor() {
        this.edad=0;
    }

    @Then("se muestra un error por la pantalla indicando que la edad es obligatorio")
    public void se_muestra_un_error_por_la_pantalla_indicando_que_la_edad_es_obligatorio() {
        Assertions.assertTrue(raisedException);
    }


    
}