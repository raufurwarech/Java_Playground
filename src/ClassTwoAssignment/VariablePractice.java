package ClassTwoAssignment;

public class VariablePractice {

    int playerID;       // instance variable
    static String category= "Cricket";        // static variable

    public void printCategory (){
        String playerName = "abd";      //local variable
        System.out.println(playerName + " Player Category - " + category);
    }

    public void printScore(){
        int score = 100;
        System.out.println("Score - " + score);
    }

    public static void main(String[] args) {

        System.out.println(VariablePractice.category);      //direct access cause category is a static variable

        VariablePractice test = new VariablePractice();         //create object for access local variable from method
        test.playerID = 202410001;   //instance variable can use without any method
        test.printScore();
        test.printCategory();
    }



}
