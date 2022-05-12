public class PartTimeStudent extends AttendanceRole{

    private Student student;

    public PartTimeStudent(Student student){
        this.student = student;
    }

    @Override
    protected void attendance() {
        System.out.println("This is a part time student!");   
    }
    
}
