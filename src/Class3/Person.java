package Class3;

public class Person {
    String name;
    String gender;
    float height;

    public Person(String name, String gender, float height){
        this.name = name;
        this.gender = name;
        this.height = height;

    }

    public Person() {

    }


    public void speak(){
        System.out.println(name + "speak");

    }

    public void work(){
        System.out.println("All are equals " + gender);

    }
}
