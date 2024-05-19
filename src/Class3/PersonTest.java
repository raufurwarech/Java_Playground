package Class3;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Rango";
        person1.gender = "male";
        person1.height = 5.10f;

        person1.speak();
        person1.work();

        Person person2 = new Person("Django", "Female", 5.3f);
        person2.speak();
        person2.work();
        

    }
}
