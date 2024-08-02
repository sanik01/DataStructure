package String;


public class JavaProgram {
    public static void main(String args[]) {
        String str = "name=ram,sita,lakshman&age=24,21,18&subjects=maths|physics|science,maths|science,english";
        String[] data = str.split("&");
        String[] names = data[0].split("=")[1].split(",");
        String[] age = data[1].split("=")[1].split(",");
        String[] subjects = data[2].split("=")[1].split("\\|"); // Corrected line
        Student[] ary = new Student[names.length];
        for (int student = 0; student < names.length; student++) {
            ary[student] = new Student(
                    names[student], Integer.parseInt(age[student]), subjects[student].split("\\|"));
        }
        for (int student = 0; student < names.length; student++) {
            System.out.println(ary[student]);
        }
    }
}

class Student {
    // Always try to give minimum visibility to data members
    private String name;
    private int age;
    private String[] subjects;

    // parameterized constructor
    Student(String name, int age, String[] subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // called internally when SOP is executed [to print this student]
    // overriding
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nSubjects: " + String.join(", ", subjects);
    }
}
