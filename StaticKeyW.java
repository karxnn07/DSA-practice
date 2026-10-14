public class StaticKeyW {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.collegeName = "Subharti University";
        
        Student s2 = new Student();
        System.out.println(s2.collegeName);

        
    }
}

class Student {
    static int getPercentage(int Math, int Phy, int Chem) {
        return (Math + Phy + Chem) / 3;
    }
    String name;
    int rollNo;

    static String collegeName = "Subharti University"; // Static Variable

    // Getter and Setter methods
    void setName(String name) {
        this.name = name;
    }
    String getname() {
        return name;
    }
}
