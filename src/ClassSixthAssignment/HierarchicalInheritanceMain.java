package ClassSixthAssignment;

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        HierarchicalInheritanceChild1 child1 = new HierarchicalInheritanceChild1();
        child1.multiply(10,20);
        child1.addition(50, 40);
        child1.subtraction(100, 50);

        HierarchicalInheritanceChild2 child2 = new HierarchicalInheritanceChild2();
        child2.addition(50, 60);
        child2.subtraction(100, 150);
        child2.division(400,40);

    }
}
