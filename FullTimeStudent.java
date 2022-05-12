
public class FullTimeStudent extends AttendanceRole{

    private Student student;

    public FullTimeStudent(Student student){
        this.student = student;
    }

    @Override
    protected void attendance() {
        System.out.println("This is a full-time student!");
    }
    
}