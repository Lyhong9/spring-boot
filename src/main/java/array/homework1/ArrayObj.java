package array.homework1;

public class ArrayObj {
    public static void main(String[] args) {
        Student[] student = new Student[3];

        student[0] = new Student("LYHong",19);
        student[1] = new Student("Yong",29);
        student[2] = new Student("Sochea",23);

        for (Student item : student) {
            System.out.println("Name: " + item.getName());
        }

        for (int i = 0; i < student.length; i++) {
            System.out.println("Age: " + student[i].getAge());
        }
    }
}
