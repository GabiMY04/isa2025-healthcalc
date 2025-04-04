    package healthcalc;



    public class HealthCalcImpl implements HealthCalc {
        @Override
        public float idealWeight(int height, char gender) throws Exception {
            if (height>250 || height<140) {
                throw new IllegalArgumentException("Altura invalida");
            }
            float res=0;
            switch (gender) {
                //Si usamos f es la conversion de float
                case 'w' -> res = height - 100 - ((height - 150) / 2.5f);
                case 'm' -> res = height - 100 - ((height - 150) / 4.0f);
                default -> throw new IllegalArgumentException("Genero invalido");
            }
            return res;
        }
        @Override
        public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception {
            if(age<5 || age>100){
                throw new IllegalArgumentException("Edad invalida");
            }else if (height>250 || height<140) {
                throw new IllegalArgumentException("Altura invalida");
            }else if (weight>300 || weight<30) {
                throw new IllegalArgumentException("Peso invalido");
            }
            float res=0;
            gender = Character.toLowerCase(gender);
            switch (gender) {
                    case 'w' -> res=447.593f + 9.247f * weight + 3.098f * height - 4.330f * age;
                    case 'm' -> res=88.362f + 13.397f * weight + 4.799f * height - 5.677f * age;
                    default -> throw new IllegalArgumentException("Genero invalido");
            } 
            return res;
        }
    }
        