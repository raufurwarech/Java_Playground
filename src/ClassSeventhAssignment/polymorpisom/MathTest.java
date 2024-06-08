package ClassSeventhAssignment.polymorpisom;

public class MathTest {
    int number;
    public void summation (){
        int number1 = 987, number2= 150;
        number = number1 + number2;
        System.out.println("Sum Of: " + number);
    }

    public void summation (int number1){
        int number2= 150;
        number = number1 + number2;
        System.out.println("Sum Of: " + number);
    }

    public void summation (int number1, int number2){
        number = number1 + number2;
        System.out.println("Sum Of: " + number);
    }

    public static void main(String[] args) {
        MathTest test = new MathTest();
        test.summation();
        test.summation(500);
        test.summation(500, 900);
    }
}
