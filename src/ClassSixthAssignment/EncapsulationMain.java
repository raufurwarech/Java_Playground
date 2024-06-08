package ClassSixthAssignment;

public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationRead read = new EncapsulationRead();
        System.out.println("Getter or Read: " + read.getName());

        EncapsulationWrite write = new EncapsulationWrite();
        write.setName("moonim");

        EncapsulationReadWrite readwrite = new EncapsulationReadWrite();
        readwrite.setName("sagar");
        System.out.println("Encapsulation Read && Write:" + readwrite.getName());
    }
}
