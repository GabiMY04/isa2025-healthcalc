package main;

import healthcalc.EU;
import healthcalc.Espanyol;
import healthcalc.HealthAdapter;
import healthcalc.HealthCalc;
import healthcalc.HealthCalcImpl;
import healthcalc.HealthHospital;
import healthcalc.Ingles;
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
            int    edad    = 30;
            float  metros = 1.70f;    //metros 
            int    gramos = 65000;    //gramos 
            float pies = (float) (metros * 3.28084); //pies
            int libras = (int) (gramos / 453.59237f); //libras

            System.out.println(" ------------ EU + Espanyol ------------ ");
            euEspanyol.bmr(genero, edad, metros, gramos);
            euEspanyol.pesoIdeal(genero, metros);

            System.out.println(" ------------ EU + Ingles ------------ ");
            euIngles.bmr(genero, edad, metros, gramos);
            euIngles.pesoIdeal(genero, metros);

            System.out.println(" ------------ USA + Espanyol ------------ ");
            usaEspanyol.bmr(genero, edad, pies, libras);
            usaEspanyol.pesoIdeal(genero, pies);

            System.out.println(" ------------ USA + Ingles ------------ ");
            usaIngles.bmr(genero, edad, pies, libras);
            usaIngles.pesoIdeal(genero, pies);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
