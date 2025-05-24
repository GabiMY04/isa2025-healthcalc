package healthcalc;

public class PersonImpl implements Person {
    private float weight;
    private float height;
    private int age;
    private Gender gender;

    public PersonImpl() {
        this.weight = 0.0f;
        this.height = 0.0f;
        this.age = 0;
    }
    public PersonImpl(float weight, float height, int age, Gender gender) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public float Weight() {
        return weight;
    }

    @Override
    public float height() {
        return height;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public int age() {
        return age;
    }
    
}

