package ClassTwoAssignment;

public class assignmentOperatorPractice {

    public static void main(String[] args) {
        int number1 = 50, number2 = 60;

        number1 += number2;
        System.out.println(number1);    //110

        number2 -= number1;
        System.out.println(number2);    //-50

        number1 *= number2;
        System.out.println(number1);    //5500

        number2 /= 10;
        System.out.println(number2);    //-5

        number1 %= 5;
        System.out.println(number1);    //0


    }
}
