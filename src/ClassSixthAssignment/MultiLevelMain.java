package ClassSixthAssignment;

public class MultiLevelMain {

    public static void main(String[] args) {
        MultiLevelRoot root = new MultiLevelChild();
        root.subtraction(400, 100);
        root.addition(420, 230);

        MultiLevelParent parent = new MultiLevelParent();
        parent.addition(200, 100);
        parent.subtraction(500, 250);
        parent.multiply(10, 5);

        MultiLevelChild child = new MultiLevelChild();
        child.addition(200, 100);
        child.subtraction(500, 250);
        child.multiply(10, 5);
        child.divide(500,50);


    }
}
