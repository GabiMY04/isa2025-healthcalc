package main;

import healthcalc.Gender;
import healthcalc.HealthAdapter;
import healthcalc.HealthHospital;
import healthcalc.Person;
import healthcalc.PersonImpl;

public class MainAdapter {
    public static void main(String[] args) {
        // Main method to run the application
        try {
            HealthHospital prueba = new HealthAdapter();

            Person personPeso = new PersonImpl(0, 1.60f, 0, Gender.MALE);

            Person personBMR = new PersonImpl(70000, 1.60f, 25, Gender.MALE);
            
            System.out.println("Peso ideal: " + prueba.pesoIdeal(personPeso) + "kg");
            System.out.println("BMR: " + prueba.bmr(personBMR) + " kcal");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
