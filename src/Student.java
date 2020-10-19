public class Student extends Person{
    private int studentId;


    public Student(String name, int studentId) {
        this.setName(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int newStudentId) {
        this.studentId = newStudentId;
    }

    @Override
    public String toString() {
        return  "studentName = " + this.getName() + ", studentId = " + studentId ;
    }
}
