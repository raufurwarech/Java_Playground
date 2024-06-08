package ClassTwoAssignment;

public class logicalOperatorPractice {

    public static void main(String[] args) {

        int number1 = 50, number2 = 60;

        System.out.println(number1 != number2);     //true
        System.out.println(number1 == number2);     //false
        System.out.println(number1 > number2);      //false
        System.out.println(number1 < number2);      //true
        System.out.println(number1 >= number2);     //false

        System.out.println((number1 != number2) && (number1 < number2));        //true
        System.out.println((number1 < number2) || (number1 >= number2));        //true
    }
}
