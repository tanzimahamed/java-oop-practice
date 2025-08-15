
public class TestSingleInherit {
    public static void main(String[] args) {
        College5 obj = new College5();
        obj.show("DIU", "ICD");

    }
}
class University5 {
    String universityName;
}
class College5 extends University5 {
    String collegeName;

    void show(String uniName, String colName) {
        this.universityName = uniName;
        this.collegeName = colName;
        System.out.println("University Name: " + universityName);
        System.out.println("College Name: " + collegeName);
    }
}