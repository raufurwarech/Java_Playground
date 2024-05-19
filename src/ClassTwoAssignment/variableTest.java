package ClassTwoAssignment;

public class variableTest {
    long studentID;
    static String departmentName = "CSE";


    public void printDepartmentName(){

        String studentName = "Karim";
        System.out.println(studentName+ " department Name " + departmentName);
    }

    public void printMark(){
        int mark = 80;
        System.out.println("Mark "+mark);
    }

    public static void main(String[] args) {
        System.out.println(variableTest.departmentName);

//        VariableTest test = new variableTest();
//        test.studentID = 202401001;
//        test.printMark();
//        test.printDepartName();
//
//        VariableTest test2 = new variableTest();
//        test.studentID = 202401001;
//        test.printMark();
//        test.printDepartName();
    }

}
