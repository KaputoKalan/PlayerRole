public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        UndergraduateStudent us = new UndergraduateStudent();

        s1.setStudentID(2017001903);
        s1.setName("John Davids");

        System.out.println("Student" + " " + s1.getName() + " " + "is a(n)" + " " + us.getRole());
    }
}
