# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

## Dependencies
--Java

---
Hay que hacer una clase HelathCalcInf
donde implementamos las clases al lado de la interfaz (codigo organizado) y los test se van a hacer en base a esas funciones


Funciones de github que vamos a usar :
```
git status
git add
git commit
```


# Public float idealWeight funcion
entradas: int height(cm) , char gender y puede lanzar una excepcion asi que necesitamos un try catch

Que lance una excepcion si no se han metido cm o gender uqe no sea 'm o v' 

if(char==m)
>For men: IW = height - 100 - (height - 150) / 4)

if(char==women)
>For women: IW = height - 100 - (height - 150) / 25)

Esto devuelve el peso ideal (kg) no hace falta conversiones

# public float basalMetabolicRate
entrada: float weight, int height , int age , char gender y lanza un excepcion

comprobar antes de nada que todos los parametros que se meten son del tipo que queremos

if(char==m)
>FFor men: BMR = 88.362 + 13.397 * weight + 4.799 * height - 5.677 * age

if(char==w)
>For women: BMR = 447.593 + 9.247 * weight + 3.098 * height - 4.330 * age

Esto nos devuelve el BMR de la persona en kcal/day




# CASOS DE PRUEBA GENERALES (concepto)

1. Comprobar si los parametros que se meten corresponden a los que se piden 
2. Comprobar que no sobrepasen los limites
3. comprobar que se hacen bien los calculos
4. Comprobar que se elige entre m o w correctamente y que salga excepcion si se pone otra cosa

# Casos de prueba funcion idealWeight
```
1. Correcta introduccion de los datos en cm y el char que solo tengo la opcino de m o w.

2. Al introducir otra letra en el genero que salga excepcion

3. Si ponemos 0 que salga una excepcion de limites

4. Si ponemos una altura mayor que la del record de altura mundial que salga error porque es imposible

```

# Casos de prueba funcion basalMetabolicRate
```

```