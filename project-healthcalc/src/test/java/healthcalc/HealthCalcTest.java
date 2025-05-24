package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
	private HealthCalc calc;

	@Test
	@DisplayName("Esto es un test de ejemplo.")
	public void bmi() {
		assertEquals(true, true);
	}

	@Test
	@DisplayName("Comprobacion para genero  invalido en la funcion idealWeight")
	public void idealWeight_genero_invalido() {
		//Arrage
		calc= HealthCalcImpl.getInstance();
		Person p = new PersonImpl(0, 163, 0, null);
		//Act
		Exception exp = assertThrows(IllegalArgumentException.class, () -> calc.idealWeight(p));

		//Assert
		assertTrue(exp.getMessage().contains("Genero invalido"));
	}
	@Test
	@DisplayName("Comprobacion para genero  invalido en la funcion basalMetabolicRate ")
	public void basalMetabolicRate_genero_invalido() {
		//Arrange
        calc = HealthCalcImpl.getInstance();
        Person p = new PersonImpl(60, 163, 18, null);
        //Act
        Exception exp = assertThrows(IllegalArgumentException.class, 
            () -> calc.basalMetabolicRate(p));
        //Assert
        assertTrue(exp.getMessage().contains("Genero invalido"));

	}
	@Test
	@DisplayName("Comprobacion altura invalida en la fucnion idealWeight")
	public void idealWeight_altura_invalido() {
		//Arrange
        calc = HealthCalcImpl.getInstance();
        Person p = new PersonImpl(60, 500, 20, Gender.FEMALE);
        //Act
        Exception exp = assertThrows(IllegalArgumentException.class, 
            () -> calc.idealWeight(p));
        //Assert
        assertTrue(exp.getMessage().contains("Altura invalida"));
	}

	@Test
	@DisplayName("Comprobacion altura invalida en la fucnion basalMetabolicRate")
	public void basalMetabolicRate_altura_invalido() {
		//Arrange
        calc = HealthCalcImpl.getInstance();
        Person p = new PersonImpl(60, 500, 18, Gender.FEMALE);
        //Act
        Exception exp = assertThrows(IllegalArgumentException.class, 
            () -> calc.basalMetabolicRate(p));
        //Assert
        assertTrue(exp.getMessage().contains("Altura invalida"));
	}

	@Test
	@DisplayName("Comprobacion edad invalida en la fucnion basalMetabolicRate")
	public void basalMetabolicRate_edad_invalido() {
		//Arrange
        calc = HealthCalcImpl.getInstance();
        Person p = new PersonImpl(60, 163, 300, Gender.FEMALE);
        //Act
        Exception exp = assertThrows(IllegalArgumentException.class, 
            () -> calc.basalMetabolicRate(p));
        //Assert
        assertTrue(exp.getMessage().contains("Edad invalida"));
	}

	@Test
	@DisplayName("Comprobacion peso  invalido en la fucnion basalMetabolicRate")
	public void basalMetabolicRate_peso_invalido() {
		//Arrange
        calc = HealthCalcImpl.getInstance();
        Person p = new PersonImpl(600, 163, 23, Gender.FEMALE);
        //Act
        Exception exp = assertThrows(IllegalArgumentException.class, 
            () -> calc.basalMetabolicRate(p));
        //Assert
        assertTrue(exp.getMessage().contains("Peso invalido"));
	}

	@Test
	@DisplayName("Calcular el peso ideal de una mujer")
	public  void idealWeight_women() throws Exception{
		//Arrage
		calc= HealthCalcImpl.getInstance();
		int height=163;
		//Act
		Person person = new PersonImpl(0, 163, 0, Gender.FEMALE);
		float res = calc.idealWeight(person);
		float res2 = height - 100 - ((height - 150) / 2.5f);
		//Assert
		assertEquals(res2, res);
	}
	@Test
	@DisplayName("calcular el peso ideal de un hombre")
	public  void idealWeight_men() throws Exception{
		 //Arrange
        calc = HealthCalcImpl.getInstance();
        int height = 163;
        Person p = new PersonImpl(0, height, 0, Gender.MALE);
        //Act
        float res = calc.idealWeight(p);
        float res2 = height - 100 - ((height - 150) / 4.0f);
        //Assert
        assertEquals(res2, res);
	}


	@Test
	@DisplayName("Comprobar  la IBM ideal de una mujer")
	public  void basalMetabolicRate_women() throws Exception{
		//Arrange
        calc = HealthCalcImpl.getInstance();
        float weight = 60;
        int height = 163;
        int age = 20;
        Person p = new PersonImpl(weight, height, age, Gender.FEMALE);
        //Act
        float res = calc.basalMetabolicRate(p);
        float res2 = 447.593f + 9.247f * weight + 3.098f * height - 4.330f * age;
        //Assert
        assertEquals(res2, res);
	}
	@Test
	@DisplayName("Comprobar la IBM ideal de un hombre")
	public  void basalMetabolicRate_men() throws Exception{
		//Arrange
        calc = HealthCalcImpl.getInstance();
        float weight = 60;
        int height = 163;
        int age = 20;
        Person p = new PersonImpl(weight, height, age, Gender.MALE);
        //Act
        float res = calc.basalMetabolicRate(p);
        float res2=88.362f + 13.397f * weight + 4.799f * height - 5.677f * age;
        //Assert
        assertEquals(res2, res);
	}
}

