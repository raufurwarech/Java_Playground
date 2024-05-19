package ClassTwoAssignment;

public class valueChangePractice {

    public static void main(String[] args) {
        int number1=50, number2=60;

        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("Number one = " + number1);
        System.out.println("NUmber two = " + number2);



    }
}
