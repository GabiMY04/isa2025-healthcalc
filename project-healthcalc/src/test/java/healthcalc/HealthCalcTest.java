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
		char gender='g';
		int height=163;
		//Act
		Exception exp=assertThrows(IllegalArgumentException.class, () -> calc.idealWeight(height, gender));
		//Assert
		assertTrue(exp.getMessage().contains("Genero invalido"));
	}
	@Test
	@DisplayName("Comprobacion para genero  invalido en la funcion basalMetabolicRate ")
	public void basalMetabolicRate_genero_invalido() {
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='g';
		int height=163;
		int age=18;
		float weight= 60;
		//Act
		Exception exp=assertThrows(IllegalArgumentException.class, () -> calc.basalMetabolicRate(weight,height,age, gender));
		//Assert
		assertTrue(exp.getMessage().contains("Genero invalido"));
	}
	@Test
	@DisplayName("Comprobacion altura invalida en la fucnion idealWeight")
	public void idealWeight_altura_invalido() {
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='w';
		int height=500;
		//Act
		Exception exp=assertThrows(IllegalArgumentException.class, () -> calc.idealWeight(height, gender));
		//Assert
		assertTrue(exp.getMessage().contains("Altura invalida"));
	}

	@Test
	@DisplayName("Comprobacion altura invalida en la fucnion basalMetabolicRate")
	public void basalMetabolicRate_altura_invalido() {
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='w';
		int height=500;
		int age=18;
		float weight= 60;
		//Act
		Exception exp=assertThrows(IllegalArgumentException.class, () -> calc.basalMetabolicRate(weight,height,age, gender));
		//Assert
		assertTrue(exp.getMessage().contains("Altura invalida"));
	}

	@Test
	@DisplayName("Comprobacion edad invalida en la fucnion basalMetabolicRate")
	public void basalMetabolicRate_edad_invalido() {
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='w';
		int height=163;
		int age=300;
		float weight= 60;
		//Act
		Exception exp=assertThrows(IllegalArgumentException.class, () -> calc.basalMetabolicRate(weight,height,age, gender));
		//Assert
		assertTrue(exp.getMessage().contains("Edad invalida"));
	}

	@Test
	@DisplayName("Comprobacion peso  invalido en la fucnion basalMetabolicRate")
	public void basalMetabolicRate_peso_invalido() {
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='w';
		int height=163;
		int age=23;
		float weight= 600;
		//Act
		Exception exp=assertThrows(IllegalArgumentException.class, () -> calc.basalMetabolicRate(weight,height,age, gender));
		//Assert
		assertTrue(exp.getMessage().contains("Peso invalido"));
	}

	@Test
	@DisplayName("Calcular el peso ideal de una mujer")
	public  void idealWeight_women() throws Exception{
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='w';
		int height=163;
		//Act
		float res= calc.idealWeight(height, gender);
		float res2 = height - 100 - ((height - 150) / 2.5f);
		//Assert
		assertEquals(res2, res);
	}
	@Test
	@DisplayName("calcular el peso ideal de un hombre")
	public  void idealWeight_men() throws Exception{
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='m';
		int height=163;
		//Act
		float res= calc.idealWeight(height, gender);
		float res2 = height - 100 - ((height - 150) / 4.0f);
		//Assert
		assertEquals(res2, res);
	}


	@Test
	@DisplayName("Comprobar  la IBM ideal de una mujer")
	public  void basalMetabolicRate_women() throws Exception{
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='w';
		int height=163;
		int age=20;
		float weight= 60;
		//Act
		float res= calc.basalMetabolicRate(weight, height, age, gender);
		float res2=447.593f + 9.247f * weight + 3.098f * height - 4.330f * age;
		//Assert
		assertEquals(res2, res);
	}
	@Test
	@DisplayName("Comprobar la IBM ideal de un hombre")
	public  void basalMetabolicRate_men() throws Exception{
		//Arrage
		calc= HealthCalcImpl.getInstance();
		char gender='m';
		int height=163;
		int age=20;
		float weight= 60;
		//Act
		float res= calc.basalMetabolicRate(weight, height, age, gender);
		float res2=88.362f + 13.397f * weight + 4.799f * height - 5.677f * age;
		//Assert
		assertEquals(res2, res);
	}
}
