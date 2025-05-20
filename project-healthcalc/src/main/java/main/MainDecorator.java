package main;

import healthcalc.EU;
import healthcalc.Espanyol;
import healthcalc.HealthAdapter;
import healthcalc.HealthHospital;
import healthcalc.Ingles;
import healthcalc.USA;

public class MainDecorator {
    public static void main(String[] args) {
        try {
            // 1. Core: convierte metros/gramos → cm/kg
            HealthHospital core = new HealthAdapter();

            // 2. Decorators de región
            HealthHospital eu   = new EU(core);    // sistema métrico europeo
            HealthHospital usa  = new USA(core);   // sistema imperial americano

            // 3. Decorators de idioma
            HealthHospital euEs    = new Espanyol(eu);   // EU + Español
            HealthHospital euEn    = new Ingles(eu);    // EU + Inglés
            HealthHospital usaEs   = new Espanyol(usa);  // USA + Español
            HealthHospital usaEn   = new Ingles(usa);   // USA + Inglés

            // Parámetros de prueba
            char   gender = 'm';
            int    age    = 30;
            float  height = 1.70f;    // en metros (input para Adapter)
            int    weight = 65000;    // en gramos (input para Adapter)

            System.out.println("=== EU + Español ===");
            euEs.bmr(gender, age, height, weight);
            euEs.pesoIdeal(gender, height);

            System.out.println("\n=== EU + Inglés ===");
            euEn.bmr(gender, age, height, weight);
            euEn.pesoIdeal(gender, height);

            System.out.println("\n=== USA + Español ===");
            usaEs.bmr(gender, age, height, weight);
            usaEs.pesoIdeal(gender, height);

            System.out.println("\n=== USA + Inglés ===");
            usaEn.bmr(gender, age, height, weight);
            usaEn.pesoIdeal(gender, height);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
