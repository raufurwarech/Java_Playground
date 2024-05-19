package ClassFourthAssignment;

public class ifElseIfLadder {
    public static void main(String[] args) {
        int mark = 170;
        if(mark>=80 && mark <=100){
            System.out.println("grade is A+");
        } else if (mark >= 70 && mark<80) {
            System.out.println("grade in A");
        } else if (mark>60 && mark <70) {
            System.out.println("grade is A-");
        } else if (mark >= 40 && mark <60) {
            System.out.println("mark is B");
        } else if (mark <40 ) {
            System.out.println("fail");
        }else {
            System.out.println("fail");
        }
    }
}
