package healthcalc;

public class PersonImpl {
    private float weight;
    private float height;
    private int age;
    private Gender gender;
    public PersonImpl(float weight, float height, int age, Gender gender) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }
    public float getWeight() {
        return weight;
    }
    public float getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
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
    
}

