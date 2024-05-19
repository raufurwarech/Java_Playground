package ClassTwoAssignment;

public class assignmentOne {
    long studentId;
     static String departmentName = "CSE";


     public void printDepartmentName(){
         String studentName ="karim";
         System.out.println(studentName+ " Department Name " +departmentName + " id " + studentId);
     }

     public void printMark(){
         int mark = 80;
         System.out.println("Mark " + mark);
     }

    public static void main(String[] args) {
        System.out.println(assignmentOne.departmentName);

        assignmentOne test1 = new assignmentOne();
        test1.studentId = 20241001;
        test1.printMark();
        test1.printDepartmentName();

        assignmentOne test2 = new assignmentOne();
        test2.studentId = 20241002;
        test2.printMark();
        test2.printDepartmentName();

    }
}
