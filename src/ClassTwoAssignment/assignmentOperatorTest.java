package ClassTwoAssignment;

public class assignmentOperatorTest {
    public static void main(String[] args) {
        int number1=66, number2=99;

        number1+=number2; // number1 = number1+number2
        System.out.println(number1);

        number2-=number1;
        System.out.println(number2);

        number1 *= number2;
        System.out.println(number1);

        number2/=11;
        System.out.println(number2);

        number1%=7;
        System.out.println(number1);
    }
}
