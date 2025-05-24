package main;

import healthcalc.EU;
import healthcalc.Espanyol;
import healthcalc.Gender;
import healthcalc.HealthAdapter;
import healthcalc.HealthCalc;
import healthcalc.HealthCalcImpl;
import healthcalc.HealthHospital;
import healthcalc.Ingles;
import healthcalc.Person;
import healthcalc.PersonImpl;
import healthcalc.USA;

public class MainDecorator {
    public static void main(String[] args) {
        try {
            //HEALTHOSPITAL ADAPTER
            HealthCalc calc = HealthCalcImpl.getInstance();
            //Le paso al calculadora 
            HealthHospital core = new HealthAdapter(calc);


            // REGION
            HealthHospital eu   = new EU(core);    
            HealthHospital usa  = new USA(core);   

            // IDIOMA
            HealthHospital euEspanyol    = new Espanyol(eu);   
            HealthHospital euIngles    = new Ingles(eu);    
            HealthHospital usaEspanyol   = new Espanyol(usa);  
            HealthHospital usaIngles   = new Ingles(usa);   


            char   genero = 'm';
            Gender gender = genero == 'm' ? Gender.MALE : Gender.FEMALE;
            int    edad    = 30;
            float  metros = 1.70f;    //metros 
            int    gramos = 65000;    //gramos 
            float pies = (float) (metros * 3.28084); //pies
            int libras = (int) (gramos / 453.59237f); //libras

            Person esp= new PersonImpl(gramos, metros, edad, gender);
            Person ingl= new PersonImpl(libras, pies, edad, gender);

            System.out.println(" ------------ EU + Espanyol ------------ ");
            euEspanyol.bmr(esp);
            euEspanyol.pesoIdeal(esp);

            System.out.println(" ------------ EU + Ingles ------------ ");
            euIngles.bmr(esp);
            euIngles.pesoIdeal(esp);

            System.out.println(" ------------ USA + Espanyol ------------ ");
            usaEspanyol.bmr(ingl);
            usaEspanyol.pesoIdeal(ingl);

            System.out.println(" ------------ USA + Ingles ------------ ");
            usaIngles.bmr(ingl);
            usaIngles.pesoIdeal(ingl);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
