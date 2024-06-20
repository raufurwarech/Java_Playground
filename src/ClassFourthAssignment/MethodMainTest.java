package ClassFourthAssignment;

public class MethodMainTest {
    public static void main(String[] args) {
        MethodTest.printName();
        MethodTest test = new MethodTest();
        System.out.println("non void method " + test.divide());
        test.printNumber();
        //System.out.println("non void method with parameter " + test.add();
    }
}
