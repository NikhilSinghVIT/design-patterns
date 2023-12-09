package BuilderPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }else if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }return null;
    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNo(2).setAge(30).setName("Nikita").setSubjects().build();
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNo(1).setAge(22).setName("Nikhil").setSubjects().build();
    }
}
